package com.example.fragmentuppgiftmoa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentuppgiftmoa.databinding.FirstFragmentBinding
class FragmentFirst: Fragment(){
   lateinit var binding: FirstFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FirstFragmentBinding.inflate(inflater, container, false)



       val gameView = GameView(requireContext())

       return gameView
    }

}


// Set the GameView as the content view for the fragment
//binding.surfaceView.holder
//return binding.root

// Create an instance of your custom GameView