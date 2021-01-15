package com.yamure.sayfagecisleriodevi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa_a.*

class SayfaAActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_a)

        buttonB.setOnClickListener {
            startActivity(Intent(this@SayfaAActivity,SayfaBActivity::class.java))
            finish()
        }
    }
}