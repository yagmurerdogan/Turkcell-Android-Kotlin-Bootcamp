package com.yamure.compositionodev1

fun main() {

    val o1 = OgrenciBilgileri(1,"Mehmet ERSOY")
    val o2 = OgrenciBilgileri(2,"Zeynep GÜR")
    val o3 = OgrenciBilgileri(4,"Cemal GELİR")

    val d1 = DersBilgileri(1,"Tarih")
    val d2 = DersBilgileri(2,"Fizik")
    val d3 = DersBilgileri(3,"Kimya")

    val g1 = GenelTablo(1,o1,d1,50,60)
    val g2 = GenelTablo(2,o1,d2,70,80)
    val g3 = GenelTablo(3,o2,d1,70,90)
    val g4 = GenelTablo(4,o3,d1,30,50)
}