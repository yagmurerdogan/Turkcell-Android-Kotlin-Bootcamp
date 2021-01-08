package com.yamure.donguodevi

fun main() {
    // 1 ile 100 arasındaki tek sayıları yazdıracak olan döngü;
    println("*** 1 - 100 Arasındaki Tek Sayılar ***")
    for(i in 1..100 step 2) {
        println("$i")
    }
}