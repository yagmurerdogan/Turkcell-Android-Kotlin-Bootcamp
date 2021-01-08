package com.yamure.nesnetabanliprogramlama

fun main() {
    val k1 = Kategoriler(1,"Dram")
    val k2 = Kategoriler(2,"Komedi")
    val k3 = Kategoriler(3,"Bilim Kurgu")

    val y1 = Yonetmenler(1,"Nuri Bilge Ceylan")
    val y2 = Yonetmenler(2,"Quentin Tarantino")
    val y3 = Yonetmenler(3,"Zeki Demirkubuz")

    val f1 = Filmler(1,"Django",2013,k1,y2)
    val f2 = Filmler(1,"Inception",2006,k3,y3)

    println("Film id: ${f1.film_id}")
    println("Film ad: ${f1.film_ad}")
    println("Film yıl: ${f1.film_yil}")
    println("Film kategori: ${f1.kategori.kategori_ad}")
    println("Film yönetmen: ${f1.yonetmen.yonetmen_ad}")

}