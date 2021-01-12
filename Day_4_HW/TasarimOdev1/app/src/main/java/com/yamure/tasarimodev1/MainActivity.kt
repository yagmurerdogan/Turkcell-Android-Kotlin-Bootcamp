package com.yamure.tasarimodev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var yamur = Locale.getDefault().toLanguageTag() //cihazın dil bilgisini alıyor


        if(yamur == "en-US") {
            textView.text = "5.98"
        } else {
            textView.text ="${5.98*7}"
        }
    }
}