package com.yamure.day_1

import java.util.*

fun main() {
    val girdi = Scanner(System.`in`)
    println("Adınızı Giriniz")
    var isim = girdi.next()

    println("Yaşınızı Giriniz")
    var yas = girdi.nextInt()


    //Örnek 1
    if(yas >= 18) {
        println("Merhaba $isim, Sisteme Girebilirsin. Reşitsin!")
    }else {
        println("Merhaba $isim, Devam Edemezsin. Reşit Değilsin!")
    }

    println("--------------------------------------------------")
    var kullaniciAdi = "admin"
    var sifre = 12345

    if(kullaniciAdi == "admin" && sifre == 12345) {
        println("Hoşgeldiniz")
    }else{
        println("Hatalı giriş yaptınız.")
    }
}