package ar.com.learnhistology.learnhistology.view

import android.app.UiModeManager
import android.content.SharedPreferences
import android.content.res.Resources
import android.graphics.Color
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.data.UserPrefs.Companion.preferences
import ar.com.learnhistology.learnhistology.databinding.ActivityMainBinding
import ar.com.learnhistology.learnhistology.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding:ActivityMainBinding
    private lateinit var navController: NavController

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_LearnHistology)

        super.onCreate(savedInstanceState)
        mBinding = inflate(layoutInflater)
        setContentView(mBinding.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        setupActionBarWithNavController(navController)
        /*val layout = mBinding.container
        layout.setBackgroundColor(getColor(R.color.purple_200))*/

        if (preferences.getMode()){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu_options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.darkMode -> darkMode()
            R.id.lightMode -> lightMode()
            R.id.language -> Toast.makeText(this, "hola", Toast.LENGTH_SHORT).show()
            R.id.share -> Toast.makeText(this, "hola", Toast.LENGTH_SHORT).show()
            R.id.btnRate -> Toast.makeText(this, "hola", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun lightMode() {
        val mode = false
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        preferences.saveMode(mode)
    }
    private fun darkMode() {
        val mode = true
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        preferences.saveMode(mode)
    }


}