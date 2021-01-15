package com.yamure.kisileruygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_kisi_kayit.*

class KisiKayitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kisi_kayit)

        buttonKaydet.setOnClickListener {
            val kisi_ad = editTextKisiAd.text.toString()
            val kisi_tel = editTextKisiTel.text.toString()

            kayit(kisi_ad,kisi_tel)
        }

    }

    fun kayit(kisi_ad:String,kisi_tel:String){
        Log.e("Kişi Kayıt","$kisi_ad - $kisi_tel")

        startActivity(Intent(this@KisiKayitActivity,MainActivity::class.java))

    }
}