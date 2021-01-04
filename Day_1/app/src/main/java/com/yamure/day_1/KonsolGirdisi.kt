package com.yamure.day_1

import java.util.*

fun main() {

    //nesneler genelde val olarak tanımlanır
    val girdi = Scanner(System.`in`)

    println("Adınızı Giriniz")
    var ad = girdi.next() //sadece next() -> stringi ifade eder

    println("Yaşınızı Giriniz")
    val yas = girdi.nextInt()

    println("Boyunuzu Giriniz")
    val boy = girdi.nextDouble()

    println("Adınız: $ad")
    println("Yaşınız: $yas")
    println("Boyunuz: $boy")

}