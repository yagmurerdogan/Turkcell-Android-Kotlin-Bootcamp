package com.yamure.collectiontypes.hashsetcalismasi

fun main() {
    val meyveler = HashSet<String>()
    /*
    1- verileri sırası ile kaydetmez
    2- aynı veriyi eklemez
     */

    meyveler.add("elma")
    meyveler.add("muz")
    meyveler.add("mandalina")

    println(meyveler.joinToString())

    meyveler.add("elma")
    println(meyveler.joinToString())

    // verilen indeksteki veriyi alma
    println(meyveler.elementAt(1))


}