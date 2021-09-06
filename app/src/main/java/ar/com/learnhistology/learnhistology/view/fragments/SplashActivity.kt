package ar.com.learnhistology.learnhistology.view.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.databinding.ActivitySplashBinding
import ar.com.learnhistology.learnhistology.databinding.ActivitySplashBinding.inflate
import ar.com.learnhistology.learnhistology.view.MainActivity

class SplashActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = inflate(layoutInflater)
        setContentView(mBinding.root)

        supportActionBar?.hide()
        mBinding.splashLogo.alpha = 0f
        mBinding.splashLogo.animate().setDuration(750).alpha(1f).withEndAction{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }


    }
}