package com.yamure.day_3_hw

fun main() {
    /*
    0-100 arasında sayılar üreterek arraylist içine aktar ve küçükten büyüğe sırala
     */
    val sayilar = ArrayList<Int>()

    for(i in 0..100) {
    val rnds = (0..100).random()
        sayilar.add(rnds)
    }

    sayilar.sort()

    for(sayi in sayilar) {
        println(sayi)
    }

}