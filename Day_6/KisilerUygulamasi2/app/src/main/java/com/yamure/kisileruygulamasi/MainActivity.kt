package com.yamure.kisileruygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),SearchView.OnQueryTextListener {
    private lateinit var kisilerListe:ArrayList<Kisiler>
    private lateinit var adapter:KisilerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbarMainActivity.title = "Kişiler"
        //toolbarMainActivity.subtitle = "Alt Başlık"
        setSupportActionBar(toolbarMainActivity)

        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this@MainActivity)

        kisilerListe = ArrayList()

        val k1 = Kisiler(1,"Yağmur","0536 xxx xx xx")
        val k2 = Kisiler(2,"Utku","0538 xxx xx xx")

        kisilerListe.add(k1)
        kisilerListe.add(k2)

        adapter = KisilerAdapter(this@MainActivity,kisilerListe)
        rv.adapter = adapter

        fab.setOnClickListener{
            startActivity(Intent(this@MainActivity,KisiKayitActivity::class.java))

            //startActivity(Intent(this@MainActivity,KisiDetayActivity::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_arama_menu,menu)

        val item = menu.findItem(R.id.action_ara)
        val searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(this)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onBackPressed() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    override fun onQueryTextSubmit(query: String): Boolean {
        Log.e("Gönderilen Arama Sonucu",query)
        return true
    }

    override fun onQueryTextChange(newText: String): Boolean {
        Log.e("Harf Girdikçe Sonuç",newText)
        return true
    }
}