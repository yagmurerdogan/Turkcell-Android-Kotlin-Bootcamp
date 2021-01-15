package com.yamure.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_oyun_ekrani.*

class OyunEkraniActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oyun_ekrani)

        val gelenMesaj = intent.getStringExtra("mesaj")
        val gelenYas = intent.getIntExtra("yas",0)//eğer bilgi girilmezse default olacak
        val gelenBoy = intent.getDoubleExtra("boy",0.0)
        val gelenBekarMi = intent.getBooleanExtra("bekarMi",false)

        if(gelenMesaj != null) {
            Log.e("Mesaj",gelenMesaj)
        }
        Log.e("Yaş",gelenYas.toString())
        Log.e("Boy",gelenBoy.toString())
        Log.e("Bekar Mı",gelenBekarMi.toString())
        /*
        !! -> her koşulda string gelecek eminim demek için
         */

        val gelenKisi = intent.getSerializableExtra("nesne") as Kisiler
        //as ile interface'i Kisiler gibi sınıfa çevirmiş olduk

        Log.e("Tc No",(gelenKisi.tcno).toString())
        Log.e("İsim",(gelenKisi.isim).toString())
        Log.e("Kişi Boy",(gelenKisi.boy).toString())



        buttonBitir.setOnClickListener {
            val intent = Intent(this@OyunEkraniActivity, SonucEkraniActivity::class.java)
            startActivity(intent)
            //finish() //backstackten oyunekranı sayfasını silmeye yarar.
        }
    }
}