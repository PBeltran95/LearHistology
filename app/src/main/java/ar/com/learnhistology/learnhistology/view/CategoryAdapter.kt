package ar.com.learnhistology.learnhistology.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.data.CategoryModel
import ar.com.learnhistology.learnhistology.databinding.ItemCategoryBinding
import com.squareup.picasso.Picasso

class CategoryAdapter(private val category:List<CategoryModel>, private var listener: OnclickListener):
    RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {



    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CategoryHolder(layoutInflater.inflate(R.layout.item_category, parent, false))
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.render(category[position])
        holder.setListener(category[position])
    }

    override fun getItemCount(): Int = category.size


     inner class CategoryHolder(view: View):RecyclerView.ViewHolder(view){
         val mBinding = ItemCategoryBinding.bind(view)

        fun render(category:CategoryModel){
            mBinding.tvCardio1.text = category.CategoryName
            mBinding.tvId.text = category.CategoryId
            Picasso.get().load(category.CategoryImage).into(mBinding.imgCardio1)
        }
         //el evento de click en la tarjeta
         fun setListener(category: CategoryModel) {
            with(mBinding.root){
                setOnClickListener { listener.onClick(category) }
            }
         }
     }

}