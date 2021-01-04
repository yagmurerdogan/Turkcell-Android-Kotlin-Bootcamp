package com.yamure.day_1_hw

import java.util.*

fun main() {
    val girdi = Scanner(System.`in`)
    println("Cismin kütlesini giriniz")
    var m = girdi.nextDouble()
    println("Cismin ivmesini giriniz")
    var a = girdi.nextDouble()
    var f = m * a
    println("Kuvvet: $f")

    println("--------------------------")
    println("Başlangıç hızı var ise -> 1, yok ise -> 2")
    var secim = girdi.nextInt()

    if(secim == 1) {
        println("Başlangıç hızını giriniz")
        var v = girdi.nextDouble()
        println("İlk hızı giriniz")
        var v0 = girdi.nextDouble()
        println("Uygulanan süreyi giriniz")
        var t = girdi.nextDouble()
        var x1 = ((v + v0)/2)*t
        println("X (yer değiştirme) : $x1")
    } else if (secim == 2) {
        println("İlk hızı giriniz")
        var v00 = girdi.nextDouble()
        println("İvmeyi giriniz")
        var ivme = girdi.nextDouble()
        println("Uygulanma süresini giriniz")
        var zaman = girdi.nextDouble()
        var x2 = (v00*zaman + (ivme*zaman*zaman)/2)
        println("x (yer değiştirme) : $x2")
    }
}