package com.yamure.day_1

//var kelimesi variable'dan gelir ve geçici değişken oluşturmaya yarar
//val kelimesi ise value'dan gelir ve kalıcı değişken oluşturmaya yarar

fun main() {
    var ogrenciAdi : String = "Yağmur"  //camelCasing
    var ogrenciYas  = 21
    var ogrenciBoy = 1.78
    var ogrenciBasHarfi = "Y" //Yeni dillerde artık bunu tek harfli bir string olarak düşünüyor

    println("Öğrenci Adı: $ogrenciAdi")
    println("Öğrenci Yaşı: $ogrenciYas" )
    println("Öğrenci Boyu: $ogrenciBoy")
    println("Öğrenci Baş Harfi: $ogrenciBasHarfi")

    println("---------------------------------")

    var urun_id : Int = 3416
    var urun_ad : String = "Kol Saati"
    var urun_adet : Int = 10
    var urun_fiyat : Double = 149.99
    var urun_tedarikci : String = "Rolex"

    println("Ürün id: $urun_id")
    println("Ürün ad: $urun_ad")
    println("Ürün adet: $urun_adet")
    println("Ürün fiyat: $urun_fiyat")
    println("Ürün tedarikçi: $urun_tedarikci")

}