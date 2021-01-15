package com.yamure.sayfagecisleriodevi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa_b.*

class SayfaBActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_b)

        buttonSon.setOnClickListener {
            startActivity(Intent(this@SayfaBActivity,SayfaYActivity::class.java))
            finish()
        }
    }
}