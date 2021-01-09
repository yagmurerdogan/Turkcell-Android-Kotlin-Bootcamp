package com.yamure.kalitiminterfaceoverriding.interfaceOrnegi

class ClassA:Interface1 {

    override val degisken: Int = 10

    override fun metod1() {
        println("Interface metod1 çalıştı")
    }
    override fun metod2(): String {
        return "Interface metod2 çalıştı"
    }
}