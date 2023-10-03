package ar.com.learnhistology.learnhistology.view

import android.content.Intent
import android.graphics.Paint
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ar.com.learnhistology.learnhistology.databinding.ActivityAboutUsBinding

class AboutUs : AppCompatActivity() {
    lateinit var mBinding:ActivityAboutUsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.tvClickable.paintFlags = Paint.UNDERLINE_TEXT_FLAG
        mBinding.tvClickable.setOnClickListener {
            val uri:Uri = Uri.parse("https://www.linkedin.com/in/pablo-beltran95/")
            val goToUri = Intent(Intent.ACTION_VIEW,uri)
            startActivity(goToUri)
        }
    }
}