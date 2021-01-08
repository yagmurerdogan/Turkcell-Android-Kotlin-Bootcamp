package com.yamure.forwhenwhileexamples

fun main() {
    //3 ile 6 arasında çalışacak bir döngü için

    for(i in 3..6) {
        println("Döngü 1: $i")
    }

    println("------------------------")
    var sayac = 3

    while(sayac < 7) {
        println("Döngü 2: $sayac")
        sayac += 1
    }
    println("------------------------")

    //0 ile 8 arasında 2'şer : 0,2,4,6,8

    for(i in 0..8 step 2) {
        println("Döngü 3: $i")
    }
    println("------------------------")

    var sayac2 = 0
    while(sayac2 < 9) {
        println("Döngü 4: $sayac2")
        sayac2 += 2
    }
    println("------------------------")

    //8 ile 0 arasında olsun 2'şer azarsın
    for(i in 8 downTo 0 step 2) {
        println("Döngü 4: $i")
    }
    println("------------------------")

    var sayac3 = 8

    while(sayac3 > -1) {
        println("Döngü 5: $sayac3")
        sayac3 -= 2
    }
    //Break kavramı
    for(i in 1..5) {
        if(i==3) {
            break
        }
        println("Döngü 6: $i")
    }
    //Continue
    for(i in 1..5){
        if(i == 3){
            continue
        }
        println("Döngü 7: $i")
    }

}