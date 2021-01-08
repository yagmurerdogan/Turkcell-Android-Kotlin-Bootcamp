package com.yamure.metodlarodev

fun main() {
    val f = Fonksiyonlar()

    val heat = f.sicaklik(30.0) // 1. metod
    println("$heat T(°F)")

    println("---------------------------")

    f.dortgenCevre(36.2,36.9) // 2. metod

    println("---------------------------")

    val faktoriyel = f.faktoriyelHesapla(6) // 3.metod
    println("$faktoriyel")

    println("---------------------------")

    f.harfSayisi("yağacak",'a')

    println("---------------------------")

    val icAci = f.icAciBul(6)
    println("İç açıları toplamı: $icAci")

    println("---------------------------")

    val maasHesap = f.maasHesabı(90)
    println("Maaş: $maasHesap")

    println("---------------------------")




}