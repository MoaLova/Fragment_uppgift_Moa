package com.example.fragmentuppgiftmoa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentuppgiftmoa.databinding.SecondFragmentBinding

class FragmentSecond : Fragment() {
    lateinit var binding: SecondFragmentBinding
    var listener: ButtonListener? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SecondFragmentBinding.inflate(layoutInflater)

        val editText1 = binding.valOneEdit
        val editText2 = binding.valTwoText
        val editText3 = binding.valThreeEdit

        binding.buttonMagic.setOnClickListener {
           val xValue = editText1.text.toString().toFloatOrNull() ?: 0f
            val yValue = editText2.text.toString().toFloatOrNull() ?: 0f

            listener?.magicButton(xValue, yValue)

        }
        return binding.root
        //return inflater.inflate(R.layout.second_fragment, container, false)


    }

    interface ButtonListener {
        fun magicButton(xValue : Float, yValue: Float)
    }
}