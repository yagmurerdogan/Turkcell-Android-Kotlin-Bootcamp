package com.yamure.kullanicietkilesimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonToastMesaj.setOnClickListener {
            Toast.makeText(applicationContext,"Toast Mesaj",Toast.LENGTH_LONG).show()
        }

        buttonSnackBar.setOnClickListener {
            Snackbar.make(buttonSnackBar,"Silmek istiyor musunuz?",Snackbar.LENGTH_LONG)
                .setAction("Evet") {view ->
                    Snackbar.make(buttonSnackBar,"Silindi",Snackbar.LENGTH_LONG).show()
                }
                .show()
        }

        buttonAlertView.setOnClickListener {
            val ad = AlertDialog.Builder(this@MainActivity)
            ad.setTitle("Başlık")
            ad.setMessage("Mesaj")
            ad.setIcon(R.drawable.resim)

            ad.setPositiveButton("Tamam"){d,i ->
                Snackbar.make(buttonAlertView,"Tamam seçildi",Snackbar.LENGTH_LONG).show()
            }
            ad.setNegativeButton("İptal"){d,i ->
                Snackbar.make(buttonAlertView,"İptal seçildi",Snackbar.LENGTH_LONG).show()
            }
            ad.create().show()
        }
    }
}