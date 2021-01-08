package com.yamure.nesnetabanliprogramlama

class Fonksiyonlar {
    //bir değer geri döndürmeyen fonksiyonlar void ile ifade edilir

    fun selamla() {
        val sonuc = "Merhaba Yağmur"
        println(sonuc)
    }

    //Geri dönüş değeri varken

    fun selamla1():String {
        val sonuc = "Merhaba Yağmur"
        return sonuc
    }

    //Parametreli Fonksiyonlar
    fun selamla2(isim:String) {
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    fun toplama(){
        val toplam = 30 + 40
        println("Toplam : $toplam")
    }

    fun toplama1():Int{
        val toplam = 30 + 40
        return toplam
    }

    fun toplama2(sayi1:Int,sayi2:Int):Int{
        val toplam = sayi1 + sayi2
        return toplam
    }

}