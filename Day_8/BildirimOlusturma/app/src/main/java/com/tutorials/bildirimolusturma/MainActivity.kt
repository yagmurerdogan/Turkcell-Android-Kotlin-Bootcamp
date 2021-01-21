package com.tutorials.bildirimolusturma

import android.app.*
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonBildirim.setOnClickListener {

            val builder: NotificationCompat.Builder
            val bildirimYoneticisi = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            val intent = Intent(this@MainActivity,MainActivity::class.java)
            val gidilecekIntent = PendingIntent.getActivity(this@MainActivity,1,intent,PendingIntent.FLAG_UPDATE_CURRENT)

            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                val kanalId = "kanalId"
                val kanalAd = "kanalAd"
                val kanalTanim = "kanalTanim"
                val kanalOnceligi = NotificationManager.IMPORTANCE_HIGH

                var kanal:NotificationChannel? = bildirimYoneticisi.getNotificationChannel(kanalId)
                if(kanal ==null){
                    kanal = NotificationChannel(kanalId,kanalAd,kanalOnceligi)
                    kanal.description = kanalTanim
                    bildirimYoneticisi.createNotificationChannel(kanal)
                }

                builder = NotificationCompat.Builder(this@MainActivity,kanalId)

                builder.setContentTitle("Başlık")
                        .setContentText("İçerik")
                        .setSmallIcon(R.drawable.resim)
                        .setAutoCancel(true)
                        .setContentIntent(gidilecekIntent)
            }else{

                builder = NotificationCompat.Builder(this@MainActivity)

                builder.setContentTitle("Başlık")
                        .setContentText("İçerik")
                        .setSmallIcon(R.drawable.resim)
                        .setAutoCancel(true)
                        .setContentIntent(gidilecekIntent)
                        .priority = Notification.PRIORITY_HIGH
            }

            bildirimYoneticisi.notify(1,builder.build())
        }
    }
}