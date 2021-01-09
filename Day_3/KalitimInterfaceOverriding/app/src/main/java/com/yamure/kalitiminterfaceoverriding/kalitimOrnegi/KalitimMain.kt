package com.yamure.kalitiminterfaceoverriding.kalitimOrnegi

fun main() {

    val topkapiSarayi = Saray(5,10)
    val bogazVilla = Villa(true,9)

    println("Topkapı Sarayı'nın Kule Sayısı: ${topkapiSarayi.kuleSayisi}")
    println("Topkapı Sarayı'nın Pencere Sayısı: ${topkapiSarayi.pencereSayisi}")

    println("---------------------------------------------------------")

    println("Villanın Garajı Var Mı? ${bogazVilla.garajVarMi}")
    println("Villanın Pencere Sayısı: ${bogazVilla.pencereSayisi}")

}