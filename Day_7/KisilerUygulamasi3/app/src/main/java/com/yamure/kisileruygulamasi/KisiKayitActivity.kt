package com.yamure.kisileruygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_kisi_kayit.*
import kotlinx.android.synthetic.main.activity_main.*

class KisiKayitActivity : AppCompatActivity() {

    private lateinit var vt:VeritabaniYardimcisi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kisi_kayit)

        toolbarKisiKayitActivity.title = "Kişi Kayıt"
        //toolbarMainActivity.subtitle = "Alt Başlık"
        setSupportActionBar(toolbarKisiKayitActivity)

        vt = VeritabaniYardimcisi(this@KisiKayitActivity)

        buttonKaydet.setOnClickListener {
            val kisi_ad = editTextKisiAd.text.toString()
            val kisi_tel = editTextKisiTel.text.toString()

            kayit(kisi_ad,kisi_tel)
        }

    }

    fun kayit(kisi_ad:String,kisi_tel:String){
        Log.e("Kişi Kayıt","$kisi_ad - $kisi_tel")

        Kisilerdao().kisiEkle(vt,kisi_ad,kisi_tel)

        startActivity(Intent(this@KisiKayitActivity,MainActivity::class.java))

    }
}