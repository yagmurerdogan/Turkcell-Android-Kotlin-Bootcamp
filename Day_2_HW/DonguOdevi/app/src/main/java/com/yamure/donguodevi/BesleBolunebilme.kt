package com.yamure.donguodevi

fun main() {
    // 1-100 arası 5'e bölünebilen sayılar
    println("*** 1-100 arası 5'e Bölünebilen Sayılar ***")
    for(i in 1..100) {
        if(i %5 != 0) {
            continue
        } else {
            println("$i")
        }
    }
}