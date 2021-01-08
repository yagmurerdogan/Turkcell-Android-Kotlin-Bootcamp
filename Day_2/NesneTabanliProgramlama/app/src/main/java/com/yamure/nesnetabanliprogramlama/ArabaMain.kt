package com.yamure.nesnetabanliprogramlama

fun main() {
    //nesneleri genelde val olarak tanımlarız
    val bmw = Araba("Siyah",0,false)
    bmw.bilgiAl()


    println("---------------------------------")

    val sahin = Araba("Beyaz",100,true)
    sahin.bilgiAl()

    println("---------------------------------")

    bmw.calistir()
    bmw.bilgiAl()

    println("---------------------------------")

    bmw.durdur()
    bmw.bilgiAl()

    println("---------------------------------")

    sahin.durdur()
    sahin.bilgiAl()

    println("---------------------------------")

}