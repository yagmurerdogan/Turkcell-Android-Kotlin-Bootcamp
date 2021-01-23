package com.yamure.kisileruygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity(),SearchView.OnQueryTextListener {
    private lateinit var kisilerListe:ArrayList<Kisiler>
    private lateinit var adapter:KisilerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbarMainActivity.title = "Kişiler"
        //toolbarMainActivity.subtitle = "Alt Başlık"
        setSupportActionBar(toolbarMainActivity)

        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this@MainActivity)

        tumKisiler()



        fab.setOnClickListener{
            startActivity(Intent(this@MainActivity,KisiKayitActivity::class.java))

            //startActivity(Intent(this@MainActivity,KisiDetayActivity::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_arama_menu,menu)

        val item = menu.findItem(R.id.action_ara)
        val searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(this)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onBackPressed() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    override fun onQueryTextSubmit(query: String): Boolean {
        Log.e("Gönderilen Arama Sonucu",query)
        aramaYap(query)
        return true
    }

    override fun onQueryTextChange(newText: String): Boolean {
        Log.e("Harf Girdikçe Sonuç",newText)
        aramaYap(newText)
        return true
    }

    fun tumKisiler(){
        var url = "http://kasimadalan.pe.hu/kisiler/tum_kisiler.php"

        val istek = StringRequest(Request.Method.GET,url,Response.Listener {cevap->

            try{
                kisilerListe = ArrayList()

                val jsonObj = JSONObject(cevap)
                val kisiler = jsonObj.getJSONArray("kisiler")

                for (i in 0 until kisiler.length()){//3 -> 0,1,2
                    val k = kisiler.getJSONObject(i)

                    val kisi_id = k.getInt("kisi_id")
                    val kisi_ad = k.getString("kisi_ad")
                    val kisi_tel = k.getString("kisi_tel")

                    val kisi = Kisiler(kisi_id,kisi_ad,kisi_tel)
                    kisilerListe.add(kisi)

                }

                adapter = KisilerAdapter(this@MainActivity,kisilerListe)
                rv.adapter = adapter

            }catch (e: JSONException){
                e.printStackTrace()
            }
        },Response.ErrorListener {Log.e("Hata","Veri okuma") })

        Volley.newRequestQueue(this@MainActivity).add(istek)
    }

    fun aramaYap(aramaKelime:String){
        var url = "http://kasimadalan.pe.hu/kisiler/tum_kisiler_arama.php"

        val istek = object: StringRequest(Request.Method.POST,url,Response.Listener {cevap->

            try{
                kisilerListe = ArrayList()

                val jsonObj = JSONObject(cevap)
                val kisiler = jsonObj.getJSONArray("kisiler")

                for (i in 0 until kisiler.length()){//3 -> 0,1,2
                    val k = kisiler.getJSONObject(i)

                    val kisi_id = k.getInt("kisi_id")
                    val kisi_ad = k.getString("kisi_ad")
                    val kisi_tel = k.getString("kisi_tel")

                    val kisi = Kisiler(kisi_id,kisi_ad,kisi_tel)
                    kisilerListe.add(kisi)
                }

                adapter = KisilerAdapter(this@MainActivity,kisilerListe)
                rv.adapter = adapter

            }catch (e: JSONException){
                e.printStackTrace()
            }
        },Response.ErrorListener {Log.e("Hata","Veri okuma") }){
            override fun getParams(): MutableMap<String, String> {
                val params = HashMap<String,String>()
                params["kisi_ad"] = aramaKelime
                return params
            }
        }

        Volley.newRequestQueue(this@MainActivity).add(istek)
    }
}