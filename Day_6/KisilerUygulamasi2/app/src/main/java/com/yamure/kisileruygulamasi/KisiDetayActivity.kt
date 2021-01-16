package com.yamure.kisileruygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        startActivity(Intent(this@KisiDetayActivity,MainActivity::class.java))

    }
}