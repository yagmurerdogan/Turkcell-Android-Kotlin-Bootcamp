package com.yamure.kisileruygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),SearchView.OnQueryTextListener {

    private lateinit var kisilerListe:ArrayList<Kisiler>
    private lateinit var adapter:KisilerAdapter
    private lateinit var refKisiler: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbarMainActivity.title = "Kişiler"
        //toolbarMainActivity.subtitle = "Alt Başlık"
        setSupportActionBar(toolbarMainActivity)

        val db = FirebaseDatabase.getInstance()
        refKisiler = db.getReference("kisiler")

        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this@MainActivity)

        kisilerListe = ArrayList()

        adapter = KisilerAdapter(this@MainActivity,kisilerListe,refKisiler)
        rv.adapter = adapter

        tumKisiler()

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
        aramaYap(query)
        return true
    }

    override fun onQueryTextChange(newText: String): Boolean {
        Log.e("Harf Girdikçe Sonuç",newText)
        aramaYap(newText)
        return true
    }

    fun tumKisiler(){
        refKisiler.addValueEventListener(object:ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                kisilerListe.clear()
                for (c in snapshot.children){
                    val kisi = c.getValue(Kisiler::class.java)
                    if (kisi != null){
                        kisi.kisi_id = c.key
                        kisilerListe.add(kisi)
                    }
                }
                adapter.notifyDataSetChanged()
            }

            override fun onCancelled(error: DatabaseError) {

            }
        })
    }

    fun aramaYap(aramaKelime:String){
        refKisiler.addValueEventListener(object:ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                kisilerListe.clear()
                for (c in snapshot.children){
                    val kisi = c.getValue(Kisiler::class.java)
                    if (kisi != null){

                        if(kisi.kisi_ad!!.contains(aramaKelime)){
                            kisi.kisi_id = c.key
                            kisilerListe.add(kisi)
                        }
                    }
                }
                adapter.notifyDataSetChanged()
            }

            override fun onCancelled(error: DatabaseError) {

            }
        })
    }
}