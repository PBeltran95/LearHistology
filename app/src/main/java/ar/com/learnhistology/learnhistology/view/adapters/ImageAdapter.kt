package ar.com.learnhistology.learnhistology.view.adapters

import android.content.Context
import android.graphics.CornerPathEffect
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter
import ar.com.learnhistology.learnhistology.R
import com.ortiz.touchview.TouchImageView


class ImageAdapter(private val mContext: Context, private val images:Array<Int>):PagerAdapter() {


    private val mImageArray = images

    override fun getCount(): Int {
        return mImageArray.size
    }

    override fun isViewFromObject(view: View, any: Any): Boolean {
        return view == any
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        /*val mImageView = ImageView(mContext)
        //En esta seccion podria cambiarse por picasso o glide

        mImageView.scaleType = ImageView.ScaleType.CENTER_CROP

        mImageView.setImageResource(mImageArray[position])

        container.addView(mImageView,0)

        return mImageView*/
        return TouchImageView(container.context).apply {
            setMaxZoomRatio(2.0F)
            canScrollHorizontally(-100)
            canScrollHorizontally(100)
            setScrollPosition(0.1F,1F)
            setImageResource(mImageArray[position])
            container.addView(this, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        }
    }

    override fun destroyItem(container: ViewGroup, position: Int, any: Any) {
        container.removeView(any as View?)
    }
}