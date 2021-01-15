package com.yamure.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonOyna.setOnClickListener {

            val kisi = Kisiler(9999,"Yağmur",1.65)

            val intent = Intent(this@MainActivity,OyunEkraniActivity::class.java)
            //intente bilgi aktarılabbilir ve geçiş yapılan yere taşınabilir
            intent.putExtra("mesaj","Merhaba")//key,deger
            intent.putExtra("yas",21)
            intent.putExtra("boy",1.78)
            intent.putExtra("bekarMi?",true)

            intent.putExtra("nesne",kisi)

            startActivity(intent)
        }
    }
}