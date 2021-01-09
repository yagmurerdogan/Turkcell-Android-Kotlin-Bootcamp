package com.yamure.collectiontypes.arraylists


fun main(){

    val ogrencilerListesi = ArrayList<Ogrenciler>()

    val sayilar = ArrayList<Int>()

    val meyveler = ArrayList<String>()

    meyveler.add("Kivi") // 0. index
    meyveler.add("Çilek") // 1. index

// listteki tüm verileri yazdırmak
    println(meyveler.joinToString())

    var gelenMeyve = meyveler.get(1)
    println(gelenMeyve)

// 0.indeksteki elemanı yazdırma
    var meyve = meyveler[0]
    println(meyve)

//veri ekleme
    meyveler.add("Mandalina")
    println(meyveler.joinToString())

//replace
    meyveler[1] = "Elma"
    println(meyveler.joinToString())

//spesifik olarak bir indekse ekleme
    meyveler.add(1,"Portakal")
    println(meyveler.joinToString())

//Arraylist boyutu
    println(meyveler.size) //genel kullanım
    println(meyveler.count())
    println(meyveler.isEmpty())

//içerik arama
    println(meyveler.contains("Çilek"))

//sırayı ters yapma
    meyveler.reverse()
    println(meyveler.joinToString())
//alfabetik olarak sıralamak için
    meyveler.sort()
    println(meyveler.joinToString())

    //Veri çekme işlemi: Yöntem 1 (For each yöntemi)

    for(meyve in meyveler){
        println("Sonuç : $meyve")
    }

    //Veri çekme işlemi: Yöntem 2 (indeks gerekiyorsa)

    for((indeks,meyve) in meyveler.withIndex()) {
        println("$indeks. indekste : $meyve")
    }

    //veri silme yöntem 1
    meyveler.removeAt(2)
    println(meyveler.joinToString())

    //veri silme yöntem 2
    meyveler.remove("Elma")
    println(meyveler.joinToString())

    //Hepsini silmek için
    meyveler.clear()
    println(meyveler.isEmpty())


}