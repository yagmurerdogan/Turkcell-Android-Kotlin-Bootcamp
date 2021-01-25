package com.yamure.kisileruygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_kisi_kayit.*
import kotlinx.android.synthetic.main.activity_main.*

class KisiKayitActivity : AppCompatActivity() {

    private lateinit var refKisiler:DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kisi_kayit)

        toolbarKisiKayitActivity.title = "Kişi Kayıt"
        //toolbarMainActivity.subtitle = "Alt Başlık"
        setSupportActionBar(toolbarKisiKayitActivity)

        val db = FirebaseDatabase.getInstance()
        refKisiler = db.getReference("kisiler")

        buttonKaydet.setOnClickListener {
            val kisi_ad = editTextKisiAd.text.toString()
            val kisi_tel = editTextKisiTel.text.toString()

            kayit(kisi_ad,kisi_tel)
        }

    }

    fun kayit(kisi_ad:String,kisi_tel:String){
        Log.e("Kişi Kayıt","$kisi_ad - $kisi_tel")

        val yeniKisi = Kisiler("",kisi_ad,kisi_tel)

        refKisiler.push().setValue(yeniKisi)

        startActivity(Intent(this@KisiKayitActivity,MainActivity::class.java))

    }
}