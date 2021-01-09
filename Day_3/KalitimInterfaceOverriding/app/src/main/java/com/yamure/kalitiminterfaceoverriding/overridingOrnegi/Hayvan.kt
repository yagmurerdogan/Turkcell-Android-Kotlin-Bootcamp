package com.yamure.kalitiminterfaceoverriding.overridingOrnegi

open class Hayvan {
    /*
    kalıtım varsa overriding'den söz edilebilir. override edilecek metoda da
    open kelimesi eklenmelidir
     */
    open fun sesCikar() {
        println("Sesim yok :(")
    }
}