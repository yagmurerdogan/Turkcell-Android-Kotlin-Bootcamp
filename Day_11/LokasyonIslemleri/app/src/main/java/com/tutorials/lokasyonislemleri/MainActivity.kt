package com.tutorials.lokasyonislemleri

import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.Task
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var izinKontrol:Int = 0
    private lateinit var flpc:FusedLocationProviderClient
    private lateinit var locationTask:Task<Location>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        flpc = LocationServices.getFusedLocationProviderClient(this)

        buttonKonumAl.setOnClickListener {
            izinKontrol = ContextCompat.checkSelfPermission(this@MainActivity,Manifest.permission.ACCESS_FINE_LOCATION)

            if(izinKontrol != PackageManager.PERMISSION_GRANTED) { //eğer izin alınmadıysa daha önce
                ActivityCompat.requestPermissions(this@MainActivity,arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),100)


            } else { // daha önce izine onay verilmişse burası çalışır
                locationTask = flpc.lastLocation
                konumBilgisiAl()
            }
        }
    }

    fun konumBilgisiAl() {
        locationTask.addOnSuccessListener { location: Location ->
            if(location != null) {
                textViewEnlem.text ="Enlem: ${location.latitude}"
                textViewBoylam.text = "Boylam: ${location.longitude}"
            }else{
                textViewEnlem.text ="Enlem bilgisine erişilemedi"
                textViewBoylam.text = "Boylam bilgisine erişilemedi"
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if(requestCode == 100) {
            izinKontrol = ContextCompat.checkSelfPermission(this@MainActivity,Manifest.permission.ACCESS_FINE_LOCATION)
            if(grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(applicationContext,"İzin kabul edildi!",Toast.LENGTH_LONG).show()
                locationTask = flpc.lastLocation
                konumBilgisiAl()
            }else{
                Toast.makeText(applicationContext,"İzin reddedildi!",Toast.LENGTH_LONG).show()
            }
        }
    }
}