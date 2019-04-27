package com.nwar.individual.databinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nwar.individual.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val user = Data()
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mainActivity = this
        binding.data = user
    }
    fun setOnClickText(view : View){
        Toast.makeText(this,"Click!",Toast.LENGTH_SHORT).show()
        user.data.set(user.data.get()+"?")
    }
}
