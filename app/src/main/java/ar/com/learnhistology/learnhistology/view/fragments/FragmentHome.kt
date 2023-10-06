package ar.com.learnhistology.learnhistology.view.fragments

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ar.com.learnhistology.learnhistology.R
import ar.com.learnhistology.learnhistology.data.models.CategoryModel
import ar.com.learnhistology.learnhistology.databinding.HomeFragmentBinding
import ar.com.learnhistology.learnhistology.view.OnclickListener
import ar.com.learnhistology.learnhistology.view.adapters.ButtonAdapter
import ar.com.learnhistology.learnhistology.view.fragments.FragmentHomeDirections.Companion.actionMainMenuToDigSysFragment

class FragmentHome : Fragment(R.layout.home_fragment), OnclickListener {

    private lateinit var binding: HomeFragmentBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = HomeFragmentBinding.bind(view)
        chooseLayout()
        setupButton()
    }

    private fun setupButton() {
        binding.btnQuiz.setOnClickListener {
            findNavController().navigate(R.id.action_main_menu_to_quizFragment)
        }
    }

    private fun chooseLayout() {
        val listOfButtons = listOf<CategoryModel>(
            CategoryModel(
                "1", "Tejido epitelial y conjuntivo", R.drawable.epitelium_icono_primer
            ),
            CategoryModel("2", "Tejido adiposo y cartilaginoso", R.drawable.fat),
            CategoryModel("3", "Sistema digestivo", R.drawable.digestivo),
            CategoryModel("4", "Sistema respiratorio", R.drawable.respiratorio),
            CategoryModel("5", "Sistema cardiovascular", R.drawable.cardio),
            CategoryModel("6", "Sistema nervioso", R.drawable.nervioso),
            CategoryModel("7", "Sistema linfatico", R.drawable.linfaticsys),
            CategoryModel("8", "Sistema endocrino", R.drawable.endocrin),
            CategoryModel("9", "Sistema oseo y sanguineo", R.drawable.images),
            CategoryModel("10", "Sistema urinario", R.drawable.urinary),
            CategoryModel("11", "Sistema reproductor", R.drawable._565170),
            CategoryModel("12", "Tejido muscular", R.drawable.muscle),
            CategoryModel("13", "Oido y ojo", R.drawable.eye),
            CategoryModel("14", "Sistema tegumentario", R.drawable.skin),
        )
        val adapter = ButtonAdapter(listOfButtons, this, requireContext())
        binding.rvButtons.adapter = adapter
        binding.rvButtons.layoutManager = setupSizes(resources, requireContext())

    }


    private fun setupSizes(
        resources: Resources,
        context: Context,
        spanCount: Int = 2,
        d: Int = 6,
        t: Int = 4
    ): RecyclerView.LayoutManager {
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
        val action = actionMainMenuToDigSysFragment(categoryModel.CategoryId)
        findNavController().navigate(action)
    }
}