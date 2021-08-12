package ar.com.learnhistology.learnhistology.data

import android.app.Application

class UserPrefs:Application() {
    companion object{
        lateinit var preferences: SharedPreferences
    }

    override fun onCreate() {
        super.onCreate()
        preferences = SharedPreferences(applicationContext)
    }
}