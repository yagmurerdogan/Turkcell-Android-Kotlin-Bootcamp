package com.yamure.nesnetabanliprogramlama

fun main() {
    val f = Fonksiyonlar()

    println("----------------------------")

    f.selamla()

    println("----------------------------")

    val gelenVeri = f.selamla1()
    println("Gelen Veri: $gelenVeri")

    println("----------------------------")

    f.selamla2("Yağmur")

    println("----------------------------")

    f.toplama()

    println("----------------------------")

    val gelenSonuc = f.toplama1()
    println(gelenSonuc)

    println("----------------------------")

    val t = f.toplama2(50,70)
    println("Toplama : $t")

}