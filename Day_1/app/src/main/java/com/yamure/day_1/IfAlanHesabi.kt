package com.yamure.day_1

import java.util.*

fun main() {
    val girdi = Scanner(System.`in`)

    println("Dikdörtgen Alanı (1)")
    println("Daire Alanı (2)")

    val secim = girdi.nextInt()
    println("Seçiminiz: $secim")

    if (secim ==1) {
        println("Kısa kenar uzunluğunu giriniz")
        val kisaKenar = girdi.nextInt()

        println("Uzun kenar uzunluğunu giriniz")
        val uzunKenar = girdi.nextInt()

        println("Dikdörtgen Alanı: ${kisaKenar * uzunKenar}")
    }
    if(secim == 2) {
        val pi = 3.14
        println("Dairenin yarıçağını giriniz")
        val yariCap1 = girdi.nextDouble()

        println("Daire Alanı: ${pi * yariCap1* yariCap1}")

    }
}