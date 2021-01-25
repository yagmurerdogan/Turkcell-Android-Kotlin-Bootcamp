package com.yamure.kisileruygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_kisi_detay.*
import kotlinx.android.synthetic.main.activity_main.*

class KisiDetayActivity : AppCompatActivity() {

    private lateinit var refKisiler: DatabaseReference
    private lateinit var kisi:Kisiler


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kisi_detay)

        toolbarKisiDetayActivity.title = "Kişi Detay"
        //toolbarMainActivity.subtitle = "Alt Başlık"
        setSupportActionBar(toolbarKisiDetayActivity)

        val db = FirebaseDatabase.getInstance()
        refKisiler = db.getReference("kisiler")

        kisi = intent.getSerializableExtra("nesne") as Kisiler
        editTextKisiAd.setText(kisi.kisi_ad)
        editTextKisiTel.setText(kisi.kisi_tel)


        buttonGuncelle.setOnClickListener {
            val kisi_ad = editTextKisiAd.text.toString()
            val kisi_tel = editTextKisiTel.text.toString()

            guncelle(kisi.kisi_id!!,kisi_ad,kisi_tel)
        }
    }

    fun guncelle(kisi_id:String,kisi_ad:String,kisi_tel:String){
        Log.e("Kişi Güncelle","$kisi_id - $kisi_ad - $kisi_tel")

        val guncelBilgiler = HashMap<String,Any>()
        guncelBilgiler.put("kisi_ad",kisi_ad)
        guncelBilgiler.put("kisi_tel",kisi_tel)

        refKisiler.child(kisi_id).updateChildren(guncelBilgiler)

        startActivity(Intent(this@KisiDetayActivity,MainActivity::class.java))

    }
}