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
        println("-♥♥-Daire Alanı Hesaplayıcı -♥♥-")
        println("Lütfen, Yarıçap Giriniz:")
        var yariCap = girdi.nextDouble()

        val pi = 3.14
        val alan = pi * yariCap * yariCap
        var flag = 1
        println("Girilen Yarıçap : $yariCap -> Daire Alanı : $alan")

        println ("-----------------------------")

        println("Yeni Bir Alan Hesabı İçin -> 1")
        println("Çıkış İçin -> 2")

        while (flag == 1) {
            var yamur = girdi.nextInt()
            if(yamur == 1) {
                flag = 0
                flagSecond = 1

            } else if (yamur == 2) {
                flag = 0
                flagSecond = 0
                println("Kendine iyi bak!")
            } else {
                println("Lütfen seçim yaparken dikkatli olun.")
            }
        }
    }

}