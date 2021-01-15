package com.yamure.sayfagecisleriodevi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa_x.*

class SayfaXActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_x)

        buttonSon2.setOnClickListener {
            startActivity(Intent(this@SayfaXActivity,SayfaYActivity::class.java))
            finish()
        }
    }
}