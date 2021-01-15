package com.yamure.kisileruygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_kisi_detay.*

class KisiDetayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kisi_detay)

        buttonGuncelle.setOnClickListener {
            val kisi_ad = editTextKisiAd.text.toString()
            val kisi_tel = editTextKisiTel.text.toString()

            guncelle(1,kisi_ad,kisi_tel)
        }
    }

    fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String){
        Log.e("Kişi Güncelle","$kisi_id - $kisi_ad - $kisi_tel")

        startActivity(Intent(this@KisiDetayActivity,MainActivity::class.java))

    }
}