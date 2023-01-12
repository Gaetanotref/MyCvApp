package com.example.newapplicationmycv

import android.content.Intent
import android.net.Uri
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


        //BUTTON TO SOCIAL
        binding.btnGit.setOnClickListener {
            val urlGit = "https://github.com/Gaetanotref"
            val intentGit = Intent(Intent.ACTION_VIEW)
            intentGit.setData(Uri.parse(urlGit))
            startActivity(intentGit)
        }

        binding.btnLinkedin.setOnClickListener {
            val urlLinkedin = "https://www.linkedin.com/in/gaetano-trefiletti-bb9580212/"
            val intentLinkedin = Intent(Intent.ACTION_VIEW)
            intentLinkedin.setData(Uri.parse(urlLinkedin))
            startActivity(intentLinkedin)
        }

        //BUTTON ON START
        binding.btnEsper.isSelected=true

        binding.btnEsper.setOnClickListener {
            //CHANGE FRAGMENT
            replaceFragment(EspFragment())
            //CHANGE BUTTON ON
            binding.btnEsper.isSelected = true
            binding.btnIstruz.isSelected = false
            binding.btnLingue.isSelected = false
        }
        binding.btnIstruz.setOnClickListener {
            //CHANGE FRAGMENT
            replaceFragment(IstrFragment())
            //CHANGE BUTTON ON
            binding.btnEsper.isSelected = false
            binding.btnIstruz.isSelected = true
            binding.btnLingue.isSelected = false
        }
        binding.btnLingue.setOnClickListener {
            //CHANGE FRAGMENT
            replaceFragment(LingFragment())
            //CHANGE BUTTON ON
            binding.btnEsper.isSelected = false
            binding.btnIstruz.isSelected = false
            binding.btnLingue.isSelected = true
        }
    }
            //FUNCTION TO CHANGE FRAGMENT
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragments, fragment)
        fragmentTransaction.commit()
    }






}
