package com.yamure.day_1_hw

fun main() {
    // 1.denklem
    val v = 5.0
    val u = 3.1
    val t = 1.3
    val a = (v-u)/t
    println("a = $a")

    //2.denklem
    val m = 10.0
    val V = 4.8
    val ro = m / V
    println("ro = $ro")

    //3.denklem
    val E = (m*v*v)/2
    println("E: $E")

    //4.denklem
    val v1 = 3.2
    val v2 = 6.3
    val m1 = 2.0
    val m2 = 5.7
    val vcm = (v1*m1 + v2*m2) / (m1 + m2)
    println("Vcm: $vcm")

    //5.denklem
    println("Wnet: ${((m*v1*v1)-(m*v2*v2))/2}")
}