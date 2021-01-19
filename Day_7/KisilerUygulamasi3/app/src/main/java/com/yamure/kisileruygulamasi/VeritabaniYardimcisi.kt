package com.yamure.kisileruygulamasi

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class VeritabaniYardimcisi(context:Context)
    :SQLiteOpenHelper(context,"kisileruygulamasi.sqlite",null,1) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE IF NOT EXISTS \"kisiler\" (\n" +
                "\t\"kisi_id\"\tINTEGER,\n" +
                "\t\"kisi_ad\"\tTEXT,\n" +
                "\t\"kisi_tel\"\tTEXT,\n" +
                "\tPRIMARY KEY(\"kisi_id\" AUTOINCREMENT)\n" +
                ")")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS kisiler")
        onCreate(db)
    }
}