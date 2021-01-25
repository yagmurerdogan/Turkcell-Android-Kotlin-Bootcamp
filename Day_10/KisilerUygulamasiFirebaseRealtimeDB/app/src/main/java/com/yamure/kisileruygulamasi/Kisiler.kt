package com.yamure.kisileruygulamasi

import com.google.firebase.database.IgnoreExtraProperties
import java.io.Serializable

@IgnoreExtraProperties
data class Kisiler(var kisi_id:String? = ""
                    ,var kisi_ad:String? = ""
                        ,var kisi_tel:String? = "") :Serializable {

}