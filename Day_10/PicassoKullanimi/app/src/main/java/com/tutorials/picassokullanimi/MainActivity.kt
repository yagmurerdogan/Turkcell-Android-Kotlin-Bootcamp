package com.tutorials.picassokullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonResim1.setOnClickListener {
            val url = "http://kasimadalan.pe.hu/yemekler/resimler/pizza.png"
            Picasso.get().load(url)
                .resize(400,400)
                .centerCrop()
                .rotate(90f) // saat yönünde 90derece döndürüyor resmi
                .into(imageViewResim)
        }

        buttonResim2.setOnClickListener {
            val url = "http://kasimadalan.pe.hu/yemekler/resimler/tiramisu.png"
            Picasso.get().load(url)
                .placeholder(R.drawable.placeholder_resim)
                .error(R.drawable.hata_resim)
                .into(imageViewResim)
        }

        buttonGoster.setOnClickListener {
            val resimAdi = editTextTextGirdi.text.toString() + ".png"
            val url = "http://kasimadalan.pe.hu/yemekler/resimler/$resimAdi"
            Picasso.get().load(url).into(imageViewResim)
        }
    }
}