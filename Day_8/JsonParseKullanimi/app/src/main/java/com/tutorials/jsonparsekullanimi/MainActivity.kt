package com.tutorials.jsonparsekullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val jsonCevap = "{\"kisiler\":[{\"kisi_id\":\"680\",\"kisi_ad\":\"Ahmet\"" +
                ",\"kisi_tel\":\"09999777\"},{\"kisi_id\":\"681\",\"kisi_ad\":\"Zeynep\"" +
                ",\"kisi_tel\":\"32523888888\"},{\"kisi_id\":\"691\",\"kisi_ad\":\"Mehmet\"" +
                ",\"kisi_tel\":\"05693693693\"}],\"success\":1}"

        jsonParseIslemi(jsonCevap)
    }
    fun jsonParseIslemi(cevap:String){

        try {
            val jsonObj = JSONObject(cevap)
            val kisiler = jsonObj.getJSONArray("kisiler")

            for(i in 0 until kisiler.length()){
                val k = kisiler.getJSONObject(i)

                val kisi_id = k.getString("kisi_id")
                val kisi_ad = k.getString("kisi_ad")
                val kisi_tel = k.getString("kisi_tel")

                Log.e("Kişi_id",kisi_id)
                Log.e("Kişi_ad",kisi_ad)
                Log.e("Kişi_tel",kisi_tel)
                Log.e("***********","***********")

            }

        }catch (e:JSONException){
            e.printStackTrace()
        }

    }
}