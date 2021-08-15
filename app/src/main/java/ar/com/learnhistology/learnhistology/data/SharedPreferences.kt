package ar.com.learnhistology.learnhistology.data

import android.content.Context

class SharedPreferences(val context:Context) {

    var SHARED_PREFERENCES_MODE = "MyDataBase"
    val SHARED_MODE = "NightMode"
    var storage = context.getSharedPreferences(SHARED_PREFERENCES_MODE, 0)

    fun saveMode(mode:Boolean){
        storage.edit().putBoolean(SHARED_MODE, mode).apply()
    }
    fun getMode():Boolean{
        return storage.getBoolean(SHARED_MODE, false)
    }

}