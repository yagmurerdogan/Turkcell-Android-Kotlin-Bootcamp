package com.yamure.sayfagecisleriodevi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sayfa_a.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonA.setOnClickListener {
            startActivity(Intent(this@MainActivity,SayfaAActivity::class.java))

        }

        buttonX.setOnClickListener {
            startActivity(Intent(this@MainActivity,SayfaXActivity::class.java))
        }
    }
}