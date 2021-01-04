package com.yamure.day_1

fun main() {

    println("SAYISAL -> SAYISAL")

    var i: Int = 42
    var d: Double = 42.45
    var f: Float = 42.89f //float'ın sonuna f harfi eklenmek zorundadır

    var sonuc1: Int = d.toInt()
    var sonuc2: Double = i.toDouble()
    var sonuc3: Int = f.toInt()

    println(sonuc1)
    println(sonuc2)
    println(sonuc3) //sonuçta ondalık kısım gitmiş oldu, buna dikkat edilmeli
    println("----------------------")

    println("SAYISAL -> STRING")
    var str1 = i.toString()
    var str2 = d.toString()
    var str3 = f.toString()

    println(str1)
    println(str2)
    println(str3)
    println("----------------------")

    println("STRING -> SAYISAL")
    var yazi = "48"
    //var sayi = yazi.toInt() //bu şekilde yazılabilir ancak hata verebilir
    var sayi = yazi.toIntOrNull()//bu kullanım programın çökmesini önler
    if(sayi != null) { //controlFlow
        println("Sayı: $sayi")
    }else{
        println("Hatalı dönüşüm")
    }

}