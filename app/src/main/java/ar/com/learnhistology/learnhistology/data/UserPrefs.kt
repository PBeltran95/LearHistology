package ar.com.learnhistology.learnhistology.data

import android.app.Application
import com.google.android.gms.ads.MobileAds

class UserPrefs : Application() {
    companion object {
        lateinit var preferences: SharedPreferences
    }

    override fun onCreate() {
        super.onCreate()
        preferences = SharedPreferences(applicationContext)
        MobileAds.initialize(this)
    }

}