package com.yamure.nesnetabanliprogramlama

class Araba(var renk:String, var hiz:Int, var calisiyorMu:Boolean) {

    fun calistir(){
        calisiyorMu = true
        hiz = 5
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun bilgiAl() {
        println("Renk : $renk")
        println("Hız : $hiz")
        println("Çalışıyor mu? : $calisiyorMu")
    }
}