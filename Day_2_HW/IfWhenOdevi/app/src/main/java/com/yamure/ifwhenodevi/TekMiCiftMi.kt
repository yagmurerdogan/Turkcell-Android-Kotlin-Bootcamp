package com.yamure.ifwhenodevi

import java.util.*

fun main() {
    // if yapısı ile

    var girdi = Scanner(System.`in`)
    println("--Tek Mi Dersin, Çift Mi?--")
    println("Lütfen bir tam sayı giriniz:")
    var sayi = girdi.nextInt()

    if (sayi % 2 == 0) {
        println("Girilen sayı : $sayi -> Çift bir sayıdır.")
    } else if(sayi % 2 != 0) {
        println("Girilen sayi $sayi -> Tek bir sayıdır.")
    } else {
        println("Geçerli bir seçim yapmadınız.")
    }

    println("-------------------------------------")

    // when yapısı ile


}