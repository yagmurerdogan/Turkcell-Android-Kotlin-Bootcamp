package com.yamure.kisileruygulamasi

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONException
import org.json.JSONObject

class KisilerAdapter(var mContext:Context,var kisilerListe:ArrayList<Kisiler>)
    : RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim:View):RecyclerView.ViewHolder(tasarim){
        var satir_card: CardView
                var satir_yazi: TextView
                        var satir_resim: ImageView


                        init{
                            satir_card = tasarim.findViewById(R.id.satir_card)
                            satir_yazi = tasarim.findViewById(R.id.satir_yazi)
                            satir_resim = tasarim.findViewById(R.id.satir_resim)
                        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.satir_tasarim,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        var kisi = kisilerListe.get(position)

        holder.satir_yazi.text = "${kisi.kisi_ad} - ${kisi.kisi_tel}"
        holder.satir_resim.setOnClickListener{
            Toast.makeText(mContext,"${kisi.kisi_ad} silindi",Toast.LENGTH_SHORT).show()

            val url = "http://kasimadalan.pe.hu/kisiler/delete_kisiler.php"
            val istek = object: StringRequest(Request.Method.POST,url, Response.Listener { cevap ->
                Log.e("Ekle Cevap",cevap)

                tumKisiler()


            }, Response.ErrorListener { Log.e("Sil Hata","Hata") }){
                override fun getParams(): MutableMap<String, String> {
                    val params = HashMap<String,String>()
                    params["kisi_id"] = kisi.kisi_id.toString()

                    return params
                }
            }

            Volley.newRequestQueue(mContext).add(istek)

        }
        holder.satir_card.setOnClickListener{
            val intent = Intent(mContext,KisiDetayActivity::class.java)
            intent.putExtra("nesne",kisi)
            mContext.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return kisilerListe.size
    }
    fun tumKisiler(){
        var url = "http://kasimadalan.pe.hu/kisiler/tum_kisiler.php"

        val istek = StringRequest(Request.Method.GET,url,Response.Listener {cevap->

            try{
                val tempListe = ArrayList<Kisiler>()

                val jsonObj = JSONObject(cevap)
                val kisiler = jsonObj.getJSONArray("kisiler")

                for (i in 0 until kisiler.length()){//3 -> 0,1,2
                    val k = kisiler.getJSONObject(i)

                    val kisi_id = k.getInt("kisi_id")
                    val kisi_ad = k.getString("kisi_ad")
                    val kisi_tel = k.getString("kisi_tel")

                    val kisi = Kisiler(kisi_id,kisi_ad,kisi_tel)
                    tempListe.add(kisi)

                }

             kisilerListe = tempListe
                notifyDataSetChanged()

            }catch (e: JSONException){
                e.printStackTrace()
            }
        },Response.ErrorListener {Log.e("Hata","Veri okuma") })

        Volley.newRequestQueue(mContext).add(istek)
    }
}