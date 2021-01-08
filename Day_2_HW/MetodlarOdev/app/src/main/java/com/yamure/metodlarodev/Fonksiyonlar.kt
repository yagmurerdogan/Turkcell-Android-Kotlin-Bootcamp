package com.yamure.metodlarodev

import java.util.*

class Fonksiyonlar {

    /*
    1- Parametre olarak girilen dereceyi Fahrenheit'a dönüşürdükten sonra
    geri döndüren metod yazınız.
     */

    fun sicaklik(derece:Double):Double {
        val fderece = (derece*1.8) + 32
        return fderece
    }

    /*
    2- Kenarları parametre olarak girilen ve dikdörtgenin çevresini
    hesaplayan bir metod yazınız.
     */

    fun dortgenCevre(a:Double,b:Double) {
        println("Dikdörtgen Çevresi: ${2*(a + b)}")
    }

    /*
    3- Parametre olarak girilen sayının faktöriyel değerini hesaplayıp
    geri döndüren metodu yazın
     */
    fun faktoriyelHesapla(sayi:Int):Int {
        var f = 1
        for (i in 1..sayi) {
            f *= i
        }
        return f
    }

    /*
    4- Parametre olarak girilen kelime ve harf için, harfin kelime içinde
    kaç adet olduğunu gösteren bir metod yazınız.
     */

    fun harfSayisi(kelime:String,harf:Char) {
        var sayac = 0
        for(i in 0..kelime.length-1){
            if(kelime[i] == harf) {
                sayac += 1
            }
        }
        println("$kelime : $sayac adet $harf bulunmaktadır.")
    }

    /*
    5- Parametre olarak girilen kenar sayısına göre iç açıların toplamını
    hesaplayıp geri döndüren metodu yazın
     */
    fun icAciBul(kenar:Int):Int{
        var aciToplami = (kenar-2)*180
        return aciToplami
    }

    /*
    6- Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve edilen
    değeri geri döndüren metod yazınız.
     */
    fun maasHesabı(gun:Int):Int {

        if (gun <= 80) {
            var maas = gun * 8 * 10
            return maas
        } else {
            var maas1 = (gun - 80) * 8 * 20
            var maas2 = 80 * 8 * 10

            var maas = maas1 + maas2
            return maas
        }
    }

    /*
    7- Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri
    döndüren metodu yazın
     */
    fun kotaHesabı(kota:Int):Int {
        if(kota <= 50) {
            var ucret = 100
            return ucret
        }else {
            var kota1 = (kota - 50)
            var ucret = kota + (kota1*4)
            return ucret
        }
    }
}