package com.yamure.ifwhenodevi

import java.util.*

fun main() {
    // if yapısı ile
    val girdi = Scanner(System.`in`)
    println("---Hoşgeldiniz---")
    println("Euro -> Türk Lirası (1)")
    println("Türk Lirası -> Euro (2)")
    var secim = girdi.nextInt()

    if(secim == 1) {
        println("Lütfen Euro miktarını giriniz:")
        val euro = girdi.nextDouble()
        println("$euro Euro : ${euro*8.99} Türk Lirası")
    } else if(secim == 2) {
        println("Lütfen Türk Lirası miktarını giriniz:")
        val tl = girdi.nextDouble()
        println("$tl Türk Lirası : ${tl / 8.99} Euro")
    } else {
        println("Geçerli bir seçim yapmadınız.")
    }

    println("----------------------------------------------------")

    // when yapısı ile

    println("--Hoşgeldiniz--")
    println("Euro -> Türk Lirası (1)")
    println("Türk Lirası -> Euro (2)")
    var secim1 = girdi.nextInt()

    when(secim1) {
        1 -> {
            println("Lütfen Euro miktarını giriniz:")
            val euro1 = girdi.nextDouble()
            println("$euro1 Euro : ${euro1*8.99} Türk Lirası")
        }

        2 -> {
            println("Lütfen Türk Lirası miktarını giriniz:")
            val tl1 = girdi.nextDouble()
            println("$tl1 Türk Lirası : ${tl1 / 8.99} Euro")
        }
        else -> println("Geçerli bir seçim yapmadınız.")
    }
}