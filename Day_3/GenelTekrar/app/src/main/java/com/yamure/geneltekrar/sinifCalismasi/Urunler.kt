package com.yamure.geneltekrar.sinifCalismasi

class Urunler(var urun_id:Int,var urun_adi:String,var urun_fiyat:Double) {

    fun siparisVer( miktar:Int){
        println("$miktar ürün sipariş verildi")
    }
}