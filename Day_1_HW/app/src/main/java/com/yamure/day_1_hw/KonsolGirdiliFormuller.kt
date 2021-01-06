package com.yamure.day_1_hw

import java.util.*
/*
Sistem fonksiyonlar ile geliştirilip sadeleştirilebilir, bunun üzerinde çalışacağım.
Ne yazık ki rakam yerine harf girilince program çöküyor bunu da exception management ile halletmeye çalışacağım
 */

fun main() {

    var flagSecond = 1
    while(flagSecond == 1) {
        val girdi = Scanner(System.`in`)
        println("-♥♥- Fizik 101'e Hoşgeldiniz -♥♥-")
        println("Kuvvet Denklemi İçin -> 1")
        println("Konum-Hız Denklemi İçin -> 2")

        var flag = 1
        var choise = girdi.nextInt()
        if(choise == 1) {

            println("Cismin kütlesini (m) giriniz")
            var m = girdi.nextDouble()
            println("Cismin ivmesini (a) giriniz")
            var a = girdi.nextDouble()
            var f = m * a
            println("Kuvvet (F): $f")

            while(flag == 1) {
                println ("-----------------------------")
                println("İşlemi bitirmek için -> 1")
                println("Başlangıca dönmek için -> 2")
                var yamur = girdi.nextInt()

                if(yamur == 1) {
                    flag = 0
                    flagSecond = 0
                    println("Kendine iyi bak!")
                } else if(yamur == 2) {
                    flag = 0
                    flagSecond = 1

                } else {
                    println("Bir sonraki seçiminde daha dikkatli olmalısın.")
                    flag = 0
                }
                break
            }


        } else if ( choise == 2) {

            println("Ortalama Hız İle Konum Zaman Denklemi İçin -> 1")
            println("İvme İle Konum Zaman Denklemi İçin -> 2 ")
            var secim = girdi.nextInt()

            if(secim == 1) {
                println("Hızı (V) giriniz")
                var v = girdi.nextDouble()
                println("Başlangıç hızını (Vo) giriniz")
                var v0 = girdi.nextDouble()
                println("Uygulanan süreyi (t) giriniz")
                var t = girdi.nextDouble()
                var x1 = ((v + v0)/2)*t
                println("X (yer değiştirme) : $x1")
            } else if (secim == 2) {
                println("Başlangıç hızını (Vo) giriniz")
                var v00 = girdi.nextDouble()
                println("İvmeyi (a) giriniz")
                var ivme = girdi.nextDouble()
                println("Uygulanma süresini (t) giriniz")
                var zaman = girdi.nextDouble()
                var x2 = (v00*zaman + (ivme*zaman*zaman)/2)
                println("x (yer değiştirme) : $x2")
            }

            while(flag == 1) {
                println("İşlemi bitirmek için -> 1")
                println("Başlangıca dönmek için -> 2")
                var yamur = girdi.nextInt()

                if(yamur == 1) {
                    flagSecond = 0
                    flag = 0
                    println("Kendine iyi bak!")
                } else if(yamur == 2) {
                    flag = 0
                    flagSecond = 1

                } else {
                    println("Bir sonraki seçiminde daha dikkatli olmalısın.")
                    flag = 0
                }
                break
            }

        } else {
            println("Lütfen geçerli bir seçim yapınız.")
        }
    }

}