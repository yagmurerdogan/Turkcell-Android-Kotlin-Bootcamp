package com.yamure.compositionodev2

fun main() {

    val b1 = BolumBilgileri(1,"Dermotoloji")
    val b2 = BolumBilgileri(2,"Kardiyoloji")
    val b3 = BolumBilgileri(3,"Fizik Tedavi")
    val b4 = BolumBilgileri(4,"Göz Hastalıkları")

    val d1 = DoktorBilgileri(1,"Sedat AK",b1)
    val d2 = DoktorBilgileri(2,"Ceyda MERMER",b2)
    val d3 = DoktorBilgileri(3,"Ahmet ZİYAN",b1)
    val d4 = DoktorBilgileri(4,"Ece KASIRGA",b3)

    val g1 = GenelTablo(1,d1,"Mehmet ERSOY","12/02/2018 10:30")
    val g2 = GenelTablo(2,d2,"Kemal ALTAY","10/04/2018 12:30")
    val g3 = GenelTablo(3,d1,"Zeynep GÜR","07/01/2018 16:00")
    val g4 = GenelTablo(4,d1,"Cemal GELİR","26/02/2018 09:30")
}