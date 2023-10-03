package ar.com.learnhistology.learnhistology.view.fragments

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.data.CategoryObjects
import ar.com.learnhistology.learnhistology.data.models.CategoryModel
import ar.com.learnhistology.learnhistology.databinding.SelectionOrganFragmentBinding
import ar.com.learnhistology.learnhistology.view.OnclickListener
import ar.com.learnhistology.learnhistology.view.adapters.CategoryAdapter
import ar.com.learnhistology.learnhistology.view.fragments.FragmentOrganSelectionDirections.Companion.actionDigSysFragmentToHistologicUrinary2
import ar.com.learnhistology.learnhistology.viewModel.WhenCategoryModel
import com.google.android.gms.ads.AdRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class FragmentOrganSelection : Fragment(R.layout.selection_organ_fragment), OnclickListener {
    companion object {
        const val BUTTON = "button"
    }

    private lateinit var binding: SelectionOrganFragmentBinding
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager
    private lateinit var mGridLayout: GridLayoutManager
    private lateinit var buttonId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            buttonId = it.getString(BUTTON).toString()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = SelectionOrganFragmentBinding.bind(view)
        lifecycleScope.launch(Dispatchers.Main) {
            val result = withContext(Dispatchers.IO){ prueba() }
            initAdapter(result)
        }
    }

     private fun prueba():List<CategoryModel> {
            var objetoRecuperado = CategoryObjects.epithelial
            when(buttonId){
                "1" -> objetoRecuperado = CategoryObjects.epithelial
                "2" -> objetoRecuperado = CategoryObjects.tejidoAdiposo
                "3" -> objetoRecuperado = CategoryObjects.digestive
                "4" -> objetoRecuperado = CategoryObjects.respiratory
                "5" -> objetoRecuperado = CategoryObjects.cardioVascular
                "6" -> objetoRecuperado = CategoryObjects.nervioso
                "7" -> objetoRecuperado = CategoryObjects.linfatico
                "8" -> objetoRecuperado = CategoryObjects.endocrino
                "9" -> objetoRecuperado = CategoryObjects.sistemaOseo
                "10" -> objetoRecuperado = CategoryObjects.sisUrinario
                "11" -> objetoRecuperado = CategoryObjects.sisReproductor
                "12" -> objetoRecuperado = CategoryObjects.muscular
                "13" -> objetoRecuperado = CategoryObjects.eyeAndEar
                "14" -> objetoRecuperado = CategoryObjects.tegumentary
            }
        return objetoRecuperado
    }

    private fun initAdapter(system:List<CategoryModel>){
        categoryAdapter = CategoryAdapter(system,this, requireContext())
        linearLayoutManager = LinearLayoutManager(requireContext())
        mGridLayout = GridLayoutManager(requireContext(), 2)
        binding.rvCategory.layoutManager = setupSizes(resources, requireContext())
        binding.rvCategory.apply { adapter = categoryAdapter  }
    }


    private fun setupSizes(resources: Resources, context: Context, spanCount: Int = 2, d:Int = 6, t:Int = 4 ): RecyclerView.LayoutManager{
        val layoutManager: RecyclerView.LayoutManager?
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            layoutManager = object : GridLayoutManager(context, spanCount) {
                override fun checkLayoutParams(lp: RecyclerView.LayoutParams): Boolean {

                    lp.height = height / 2
                    lp.width = (width / 5) * 2

                    return true
                }
            }
            return layoutManager
        } else {
            layoutManager = object : GridLayoutManager(context, 2) {
                override fun checkLayoutParams(lp: RecyclerView.LayoutParams): Boolean {
                    lp.height = height / 8
                    return true
                }
            }
            return layoutManager
        }
    }

    override fun onClick(categoryModel: CategoryModel) {
        navigateToHistologyFragment(categoryModel)
    }

    private fun navigateToHistologyFragment(categoryModel: CategoryModel) {
            val buttonText = WhenCategoryModel().getButton(categoryModel.CategoryName)
            actionDigSysFragmentToHistologicUrinary2(buttonText)
            view?.findNavController()?.navigate(actionDigSysFragmentToHistologicUrinary2(buttonText))
    }
}