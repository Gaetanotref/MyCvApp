package com.example.newapplicationmycv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.newapplicationmycv.databinding.ActivitySecondBinding

class Second_Activity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnEsper.isSelected=true

        binding.btnEsper.setOnClickListener {
            replaceFragment(EspFragment())
            binding.btnEsper.isSelected = true
            binding.btnIstruz.isSelected = false
            binding.btnLingue.isSelected = false
        }
        binding.btnIstruz.setOnClickListener {
            replaceFragment(IstrFragment())
            binding.btnEsper.isSelected = false
            binding.btnIstruz.isSelected = true
            binding.btnLingue.isSelected = false
        }
        binding.btnLingue.setOnClickListener {
            replaceFragment(LingFragment())
            binding.btnEsper.isSelected = false
            binding.btnIstruz.isSelected = false
            binding.btnLingue.isSelected = true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragments, fragment)
        fragmentTransaction.commit()
    }






}
