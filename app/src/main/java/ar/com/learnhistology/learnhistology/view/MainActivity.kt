package ar.com.learnhistology.learnhistology.view

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import ar.com.learnhistology.learnhistology.BuildConfig
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.data.UserPrefs.Companion.preferences
import ar.com.learnhistology.learnhistology.databinding.ActivityMainBinding
import ar.com.learnhistology.learnhistology.databinding.ActivityMainBinding.inflate
import ar.com.learnhistology.learnhistology.view.fragments.main_menuDirections

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
            R.id.language -> toAboutUsFragment()
            R.id.share -> shareApp()
            R.id.btnRate -> rateApp()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun toAboutUsFragment() {
        val intent = Intent(this, AboutUs::class.java)
        startActivity(intent)
    }

    private fun rateApp() {
        val uri:Uri = Uri.parse("https://play.google.com/store/apps/details?id="
                + BuildConfig.APPLICATION_ID)
        val goToMarket = Intent(Intent.ACTION_VIEW,uri)

        goToMarket.addFlags( Intent.FLAG_ACTIVITY_NO_HISTORY or
                                    Intent.FLAG_ACTIVITY_NEW_DOCUMENT or
                                    Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
        try {
            startActivity(goToMarket)
        }catch (e:ActivityNotFoundException){
            startActivity(Intent(Intent.ACTION_VIEW,
            Uri.parse("market://details?id=com.")))
        }

    }

    private fun shareApp() {
       val sendApp:Intent = Intent().apply {
           action = Intent.ACTION_SEND
           putExtra(Intent.EXTRA_TEXT, "Hey download LearnHistology " +
                   "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID)
           type = "text/plain"
       }
        val shareIntent = Intent.createChooser(sendApp, null)
        startActivity(shareIntent)
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