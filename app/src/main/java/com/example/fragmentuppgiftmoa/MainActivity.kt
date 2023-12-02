package com.example.fragmentuppgiftmoa

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.SurfaceHolder
import androidx.fragment.app.commit
import com.example.fragmentuppgiftmoa.databinding.ActivityMainBinding
import com.example.fragmentuppgiftmoa.databinding.FirstFragmentBinding


class MainActivity : AppCompatActivity(), SurfaceHolder.Callback {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(GameView(this))

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportFragmentManager.commit {
            add(R.id.frameLayout, FragmentFirst())
        }
        binding.button1.setOnClickListener{
            supportFragmentManager.commit {
                replace(R.id.frameLayout, FragmentFirst())
            }
        }
        binding.button2.setOnClickListener{
            supportFragmentManager.commit {
                replace(R.id.frameLayout, FragmentSecond())
            }
        }

    }

    override fun surfaceCreated(p0: SurfaceHolder) {
        TODO("Not yet implemented")
    }

    override fun surfaceChanged(p0: SurfaceHolder, p1: Int, p2: Int, p3: Int) {
        TODO("Not yet implemented")
    }

    override fun surfaceDestroyed(p0: SurfaceHolder) {
        TODO("Not yet implemented")
    }
}