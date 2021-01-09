package com.yamure.day_3_hw

import java.util.*
import kotlin.collections.ArrayList

fun main() {

    /*
    Beş tane isimden oluşan bir arraylsit oluştur. Konsoldan girilen
    ismin listede olup olmadığını kontol et
     */
    val ogrenciListesi = ArrayList<String>()

    ogrenciListesi.add("Yağmur")
    ogrenciListesi.add("Ela")
    ogrenciListesi.add("Utku")
    ogrenciListesi.add("Elif")
    ogrenciListesi.add("Mina")

    val isim = Scanner(System.`in`)

    println("Listede olup olmadığını kontrol edeceğiniz ismi giriniz:")
    val girdi = isim.next()

    var sonuc =ogrenciListesi.contains(girdi)
    if(sonuc) {
        println("$girdi listede bulunmaktadır.")
    }else {
        println("$girdi listede yoktur.")
    }

}