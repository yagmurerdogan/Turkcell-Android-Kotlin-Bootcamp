package com.yamure.widgetcalismasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonOku.setOnClickListener {
            val alinanVeri = editTextGirdi.text.toString()

            textViewCikti.text = alinanVeri
        }

        buttonResim1.setOnClickListener {
            resimTutucu.setImageResource(R.drawable.resim1) //yöntem 1
        }

        buttonResim2.setOnClickListener {
            resimTutucu.setImageResource(resources.getIdentifier("resim2","drawable",packageName))
        }
    }
}