package ar.com.learnhistology.learnhistology.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ar.com.learnhistology.learnhistology.R

class dig_sys_fragment : Fragment() {
    //El sistema digestivo es muy grande por lo que hay que implementar 3 fragmentos mas.

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dig_sys, container, false)
    }

}