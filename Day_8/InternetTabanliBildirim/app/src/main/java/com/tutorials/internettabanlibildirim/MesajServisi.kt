package com.tutorials.internettabanlibildirim

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MesajServisi:FirebaseMessagingService() {
    override fun onMessageReceived(p0: RemoteMessage) {
        super.onMessageReceived(p0)

        Log.e("Başlık",p0.notification!!.title!!)
        Log.e("İçerik",p0.notification!!.body!!)
        bildirimOlustur(p0.notification!!.title!!,p0.notification!!.body!!)
    }
    fun bildirimOlustur(baslik:String?,icerik:String?){
        val builder: NotificationCompat.Builder
        val bildirimYoneticisi = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val intent = Intent(this,MainActivity::class.java)
        val gidilecekIntent = PendingIntent.getActivity(this,1,intent, PendingIntent.FLAG_UPDATE_CURRENT)

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val kanalId = "kanalId"
            val kanalAd = "kanalAd"
            val kanalTanim = "kanalTanim"
            val kanalOnceligi = NotificationManager.IMPORTANCE_HIGH

            var kanal: NotificationChannel? = bildirimYoneticisi.getNotificationChannel(kanalId)
            if(kanal ==null){
                kanal = NotificationChannel(kanalId,kanalAd,kanalOnceligi)
                kanal.description = kanalTanim
                bildirimYoneticisi.createNotificationChannel(kanal)
            }

            builder = NotificationCompat.Builder(this,kanalId)

            builder.setContentTitle(baslik)
                .setContentText(icerik)
                .setSmallIcon(R.drawable.resim)
                .setAutoCancel(true)
                .setContentIntent(gidilecekIntent)
        }else{

            builder = NotificationCompat.Builder(this)

            builder.setContentTitle(baslik)
                .setContentText(icerik)
                .setSmallIcon(R.drawable.resim)
                .setAutoCancel(true)
                .setContentIntent(gidilecekIntent)
                .priority = Notification.PRIORITY_HIGH
        }

        bildirimYoneticisi.notify(1,builder.build())
    }
}