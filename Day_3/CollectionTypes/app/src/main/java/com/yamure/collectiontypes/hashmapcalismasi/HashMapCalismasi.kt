package com.yamure.collectiontypes.hashmapcalismasi

fun main() {
    val iller = HashMap<Int,String>()

    iller.put(1,"Adana")
    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")
    iller.put(37,"Kastamonu")

    println(iller.toString())

    println(iller.get(16))

    iller.put(16,"Yeni Bursa")
    println(iller.toString())

    //belirtilen key ve stringin olup olmadığını kontrol eder
    println(iller.containsKey(16)) //true
    println(iller.containsValue("İstanbul")) //true

    //belirli keydeki veriyi siler
    iller.remove(16)
    println(iller.toString())

    //hepsini siler
    iller.clear()
    println(iller.toString())
}