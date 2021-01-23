package com.yamure.kisileruygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_kisi_kayit.*
import kotlinx.android.synthetic.main.activity_main.*

class KisiKayitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kisi_kayit)

        toolbarKisiKayitActivity.title = "Kişi Kayıt"
        //toolbarMainActivity.subtitle = "Alt Başlık"
        setSupportActionBar(toolbarKisiKayitActivity)

        buttonKaydet.setOnClickListener {
            val kisi_ad = editTextKisiAd.text.toString()
            val kisi_tel = editTextKisiTel.text.toString()

            kayit(kisi_ad,kisi_tel)
        }

    }

    fun kayit(kisi_ad:String,kisi_tel:String){
        Log.e("Kişi Kayıt","$kisi_ad - $kisi_tel")

        val url = "http://kasimadalan.pe.hu/kisiler/insert_kisiler.php"
        val istek = object: StringRequest(Request.Method.POST,url,Response.Listener { cevap ->
            Log.e("Ekle Cevap",cevap)

            startActivity(Intent(this@KisiKayitActivity,MainActivity::class.java))

        },Response.ErrorListener { Log.e("Ekle Hata","Hata") }){
            override fun getParams(): MutableMap<String, String> {
                val params = HashMap<String,String>()
                params["kisi_ad"] = kisi_ad
                params["kisi_tel"] = kisi_tel
                return params
            }
        }

        Volley.newRequestQueue(this@KisiKayitActivity).add(istek)

    }
}