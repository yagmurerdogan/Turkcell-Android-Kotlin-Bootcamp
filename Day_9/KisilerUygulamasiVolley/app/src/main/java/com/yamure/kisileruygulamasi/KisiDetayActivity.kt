package com.yamure.kisileruygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_kisi_detay.*
import kotlinx.android.synthetic.main.activity_main.*

class KisiDetayActivity : AppCompatActivity() {

    private lateinit var kisi:Kisiler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kisi_detay)

        toolbarKisiDetayActivity.title = "Kişi Detay"
        //toolbarMainActivity.subtitle = "Alt Başlık"
        setSupportActionBar(toolbarKisiDetayActivity)

        kisi = intent.getSerializableExtra("nesne") as Kisiler
        editTextKisiAd.setText(kisi.kisi_ad)
        editTextKisiTel.setText(kisi.kisi_tel)


        buttonGuncelle.setOnClickListener {
            val kisi_ad = editTextKisiAd.text.toString()
            val kisi_tel = editTextKisiTel.text.toString()

            guncelle(kisi.kisi_id,kisi_ad,kisi_tel)
        }
    }

    fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String){
        Log.e("Kişi Güncelle","$kisi_id - $kisi_ad - $kisi_tel")

        val url = "http://kasimadalan.pe.hu/kisiler/update_kisiler.php"
        val istek = object: StringRequest(Request.Method.POST,url, Response.Listener { cevap ->
            Log.e("Güncelle Cevap",cevap)

            startActivity(Intent(this@KisiDetayActivity,MainActivity::class.java))

        }, Response.ErrorListener { Log.e("Ekle Hata","Hata") }){
            override fun getParams(): MutableMap<String, String> {
                val params = HashMap<String,String>()
                params["kisi_id"] = kisi_id.toString()
                params["kisi_ad"] = kisi_ad
                params["kisi_tel"] = kisi_tel
                return params
            }
        }

        Volley.newRequestQueue(this@KisiDetayActivity).add(istek)

    }
}