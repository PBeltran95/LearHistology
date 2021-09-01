package ar.com.learnhistology.learnhistology.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ar.com.learnhistology.learnhistology.data.models.CategoryModel
import ar.com.learnhistology.learnhistology.data.CategoryObjects
import ar.com.learnhistology.learnhistology.databinding.FragmentDigSysBinding
import ar.com.learnhistology.learnhistology.view.OnclickListener
import ar.com.learnhistology.learnhistology.view.adapters.CategoryAdapter
import ar.com.learnhistology.learnhistology.viewModel.WhenCategoryModel
import com.google.android.gms.ads.AdRequest
import kotlinx.coroutines.*

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
        GlobalScope.launch(Dispatchers.Main) {
            val result = withContext(Dispatchers.IO){prueba() }
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

    private fun initLoadAds() {
    }
    private fun initAdapter(system:List<CategoryModel>){
        categoryAdapter = CategoryAdapter(system,this)
        linearLayoutManager = LinearLayoutManager(requireContext())
        mGridLayout = GridLayoutManager(requireContext(), 2)
        binding.rvCategory.apply {
            layoutManager = mGridLayout
            adapter = categoryAdapter
        }
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