package com.example.popular_libraries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.popular_libraries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val counters = mutableListOf(0, 0, 0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnNumberOne.setOnClickListener {
                tvTextNumberOne.text = (++counters[0]).toString()
            }

            btnNumberTwo.setOnClickListener {
                tvTextNumberTwo.text = (++counters[1]).toString()
            }

            btnNumberThree.setOnClickListener {
                tvTextNumberThree.text = (++counters[2]).toString()
            }
        }


    }

    private fun initViews() {
        with(binding) {
            tvTextNumberOne.text = counters[0].toString()
            tvTextNumberTwo.text = counters[1].toString()
            tvTextNumberThree.text = counters[2].toString()

        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putIntArray("counters", counters.toIntArray())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val array = savedInstanceState.getIntArray("counters")
        counters.let { list ->
            list.clear()
            array?.toList()?.let {
                list.addAll(it)
            }
        }

        initViews()


    }

}