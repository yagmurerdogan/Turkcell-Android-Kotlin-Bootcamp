package com.yamure.ifwhenodevi

import java.util.*

fun main() {
    val girdi = Scanner(System.`in`)
    println("---Yağmur'un Yemek Dünyasına Hoşgeldiniz---")
    println("--- Menü ---")
    println("Tatlılar -> 1")
    println("Tuzlular -> 2")
    println("Sıcak Yemekler -> 3")

    println("İçeriğini görmek istediğiniz menü numarasını giriniz:")
    var menuNo = girdi.nextInt()
    if(menuNo == 1) {
        println("Tiramisu")
        println("Kadayıf")
    } else if(menuNo == 2) {
        println("Susamlı kurabiye")
        println("Çubuk kurabiye")
    } else if(menuNo == 3) {
        println("Tarhana çorbası")
        println("Bezelye yemeği")
    } else {
        println("Geçerli bir menü numarası girmediniz.")
    }

}