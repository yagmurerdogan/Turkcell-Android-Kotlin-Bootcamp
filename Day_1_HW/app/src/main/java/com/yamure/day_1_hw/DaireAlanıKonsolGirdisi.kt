package com.yamure.day_1_hw

import java.util.*

fun main() {
val girdi = Scanner(System.`in`)
    println("Yarıçap Giriniz:")
    var yariCap = girdi.nextDouble()

    val pi = 3.14
    val alan = pi * yariCap * yariCap
    println("Yarıçap : $yariCap -> Daire Alanı : $alan")
}