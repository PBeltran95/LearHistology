package ar.com.learnhistology.learnhistology.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ar.com.learnhistology.learnhistology.data.CategoryModel
import ar.com.learnhistology.learnhistology.data.CategoryObjects
import ar.com.learnhistology.learnhistology.databinding.FragmentDigSysBinding
import ar.com.learnhistology.learnhistology.viewModel.WhenCategoryModel
import com.google.android.gms.ads.AdRequest

class dig_sys_fragment : Fragment(), OnclickListener {
    companion object {
        const val BUTTON = "button"
    }

    private var _binding:FragmentDigSysBinding? = null
    private val binding get() = _binding!!
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var linearLayoutManager:RecyclerView.LayoutManager
    private lateinit var mGridLayout: GridLayoutManager
    private lateinit var buttonId:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            buttonId = it.getString(BUTTON).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDigSysBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initLoadAds()
        when(buttonId){
            "1" -> initAdapter(CategoryObjects.epithelial)
            "2" -> initAdapter(CategoryObjects.tejidoAdiposo)
            "3" -> initAdapter(CategoryObjects.digestive)
            "4" -> initAdapter(CategoryObjects.respiratory)
            "5" -> initAdapter(CategoryObjects.cardioVascular)
            "6" -> initAdapter(CategoryObjects.nervioso)
            "7" -> initAdapter(CategoryObjects.linfatico)
            "8" -> initAdapter(CategoryObjects.endocrino)
            "9" -> initAdapter(CategoryObjects.sistemaOseo)
            "10" -> initAdapter(CategoryObjects.sisUrinario)
            "11" -> initAdapter(CategoryObjects.sisReproductor)
            "12" -> initAdapter(CategoryObjects.muscular)
            "13" -> initAdapter(CategoryObjects.eyeAndEar)
            "14" -> initAdapter(CategoryObjects.tegumentary)
        }

        linearLayoutManager = LinearLayoutManager(requireContext())
        mGridLayout = GridLayoutManager(requireContext(), 2)
        binding.rvCategory.apply {
            layoutManager = mGridLayout
            adapter = categoryAdapter
        }
    }
    private fun initLoadAds() {
        val adRequest = AdRequest.Builder().build()
        binding.bannerMain.loadAd(adRequest)
    }
    private fun initAdapter(system:List<CategoryModel>){
        categoryAdapter = CategoryAdapter(system,this)
    }

    override fun onClick(categoryModel: CategoryModel) {
        navigateToHistologyFragment(categoryModel)
    }

    private fun navigateToHistologyFragment(categoryModel: CategoryModel) {
            val buttonText = WhenCategoryModel().getButton(categoryModel.CategoryName)
            dig_sys_fragmentDirections.actionDigSysFragmentToHistologicUrinary2(buttonText)
            view?.findNavController()?.navigate(dig_sys_fragmentDirections.actionDigSysFragmentToHistologicUrinary2(buttonText))
    }
}