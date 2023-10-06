package ar.com.learnhistology.learnhistology.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.data.models.CategoryModel
import ar.com.learnhistology.learnhistology.view.OnclickListener
import ar.com.learnhistology.learnhistology.databinding.ItemCategoryBinding
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.RoundedCorners


class ButtonAdapter(private val category:List<CategoryModel>, private var listener: OnclickListener, private var context: Context):
    RecyclerView.Adapter<ButtonAdapter.CategoryHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryHolder {
        context = parent.context
        val layoutInflater = LayoutInflater.from(parent.context)
        return CategoryHolder(layoutInflater.inflate(R.layout.item_category, parent, false))
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.render(category[position])
        holder.setListener(category[position])
    }

    override fun getItemCount(): Int = category.size


    inner class CategoryHolder(view: View):RecyclerView.ViewHolder(view){
        private val mBinding = ItemCategoryBinding.bind(view)

        fun render(category: CategoryModel){
            mBinding.tvCardio1.text = category.CategoryName
            mBinding.tvId.text = category.CategoryId
            Glide.with(context)
                .load(category.CategoryImage)
                .override(50,50)
                .transform(RoundedCorners(5))
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                .into(mBinding.imgCardio1)
            /*
            Es mas rapido Glide.
            Picasso.get().load(category.CategoryImage).resize(50,50).into(mBinding.imgCardio1)*/
        }
        //el evento de click en la tarjeta
        fun setListener(category: CategoryModel) {
            with(mBinding.root){
                setOnClickListener { listener.onClick(category) }
            }
        }
    }

}