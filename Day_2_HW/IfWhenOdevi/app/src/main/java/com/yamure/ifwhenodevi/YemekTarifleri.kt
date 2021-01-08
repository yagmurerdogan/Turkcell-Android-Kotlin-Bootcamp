package com.yamure.ifwhenodevi

import java.util.*

fun main() {
    val girdi = Scanner(System.`in`)
    println("--- Tarif Kitabına Hoşgeldiniz ---")
    println("Krep -> 1")
    println("Sağlıklı Çikolata -> 2")
    println("Tarifini görmek istediğiniz yemeğin numarasını giriniz: ")
    var secim = girdi.nextInt()

    if(secim == 1) {
        println("--- Krep Tarifi ---")
        println("Malzemeler; \n 1 adet yumurta \n 200 ml süt " +
                "\n 1 bardak un \n 1 çay kaşığı tuz ")
        println("Tüm malzemeleri sırası ile karıştırıp güzelce çırpın." +
                "\nHomojem bir karışım elde edince önceden ısıtılmış ve yağlanmış tavaya" +
                " ince bir katman oluşacak şekilde karışımı dökün." +
                "\nBir kaç dakika içinde krebin altı koyulaşacak ve tavadan kolayca çıkarılacak." +
                "\nAynı işlemi krebin diğer yüzü için de uygulayınız.")
    } else if(secim == 2) {
        println("--- Sağlıklı Çikolata Tarifi ---")
        println("Malzemeler; \n 8 adet hurma \n 8 adet fındık \n 1 yemek kaşısı hindistan cevizi yağı" +
                "\n 2 yemek kaşığı kakao")
        println("Hurmaları bir saat kaynar suda bekletin ve yumuşadıktan sonra çekirdeklerini ayırın." +
                "\nHurmaları, hindistan cevizi yağını ve kakaoyu blenderda güzelce karıştırın." +
                "\nHomojen bir karışım elde edince yağlı kağıt üzerinde şekillendirip üzerine fındıkları koyabilirsiniz." +
                "\nBir gün buzdolabında durduktan sonra afiyetle yiyebilirsiniz.")
    } else {
        println("Geçerli bir seçim yapmadınız.")
    }
}