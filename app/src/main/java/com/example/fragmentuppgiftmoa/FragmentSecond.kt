package com.example.fragmentuppgiftmoa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentuppgiftmoa.databinding.SecondFragmentBinding

class FragmentSecond : Fragment(){
    //lateinit var binding: SecondFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       // binding = SecondFragmentBinding.inflate(layoutInflater)
        //return binding.root
        return inflater.inflate(R.layout.second_fragment, container, false)

    }
}