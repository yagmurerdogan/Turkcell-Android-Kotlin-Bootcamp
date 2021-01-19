package com.tutorials.sayacuygulamasi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp = getSharedPreferences("GirisSayaci", Context.MODE_PRIVATE)
        val editor = sp.edit()
        var sayac = sp.getInt("sayac",0)
        editor.putInt("sayac",++sayac)
        editor.commit()

        textViewSayac.text = "Açılış Sayısı: $sayac"
    }
}