package com.yamure.nesnetabanliprogramlama

fun main(){

    var str1:String? = null
    println(str1?.trim()) //trim boşlukları siliyor

    println("----------------------------")

    if(str1 != null){
        println(str1.trim())
    }
}