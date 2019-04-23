package com.nwar.individual.databinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nwar.individual.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.activity = this
        binding.tvText1.text = "Hello!"
    }

    fun setOnClick(v : View){
        when(v.id){
            binding.tvText1.id -> Toast.makeText(this,"터치",Toast.LENGTH_SHORT).show()
        }
    }
}
