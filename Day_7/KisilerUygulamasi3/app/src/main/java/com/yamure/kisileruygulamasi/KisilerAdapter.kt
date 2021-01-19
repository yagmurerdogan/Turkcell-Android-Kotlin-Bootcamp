package com.yamure.kisileruygulamasi

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class KisilerAdapter(var mContext:Context,var kisilerListe:ArrayList<Kisiler>,var vt:VeritabaniYardimcisi)
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
            Kisilerdao().kisiSil(vt,kisi.kisi_id)
            kisilerListe = Kisilerdao().tumKisiler(vt)
            notifyDataSetChanged()
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
}