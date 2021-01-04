package com.yamure.day_1

fun main() {
    //Daire alanı
    val pi = 3.14
    val yariCap = 2.0
    val alan = pi * yariCap * yariCap
    println("Daire Alanı: $alan")

    println("-----------------------")

    //F = m.a
    var m1 = 12.5
    var a = 10.3
    var f = m1 * a
    println("F : $f")

    println("-----------------------")

    //ro = m/v
    var m2 = 20
    var v1 = 4.3
    var ro = m2 / v1
    println("Yoğunluk: $ro")

    println("-----------------------")

    //X
    var v = 12.7
    var v0 = 23.56
    var t = 3.5

    var x = ((v + v0) / 2 ) * t
    println("x: $x")

    println("-----------------------")
    //Kısaltmalar

    var y = 10
    println("y: $y")

    y++
    println("y++")
    println("y: $y")

    y--
    println("y--")
    println("y: $y")

    y+=2
    println("y+=2")
    println("y: $y")

    y*=2
    println("y*=2")
    println("y: $y")

}