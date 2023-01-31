package com.lux.zena.copyapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.lux.zena.copyapp.R
import com.lux.zena.copyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.main = viewModel

//        val nameObserver = Observer<Int>{
//            binding.tvTest01.text = it.toString()
//        }
//        viewModel.number.observe(this,nameObserver)

        viewModel.number.observe(this, Observer {
            binding.tvTest01.text = it.toString()
        })

    }
}