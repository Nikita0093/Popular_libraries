package com.example.popular_libraries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.popular_libraries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var presenter: CountersPresenter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setTheme(R.style.Theme_Popular_libraries)
        setContentView(binding.root)

        initPresenter()

        with(binding) {
            btnNumberOne.setOnClickListener {
                presenter.onCounterClickBtnOne()
            }

            btnNumberTwo.setOnClickListener {
                presenter.onCounterClickBtnTwo()
            }

            btnNumberThree.setOnClickListener {
                presenter.onCounterClickBtnThree()
            }
        }


    }

    private fun initPresenter() {
        presenter = CountersPresenter(this)
    }


    override fun setTextBtnOne(counter: String) {
        binding.tvTextNumberOne.text = counter

    }

    override fun setTextBtnTwo(counter: String) {
        binding.tvTextNumberTwo.text = counter
    }

    override fun setTextBtnThree(counter: String) {
        binding.tvTextNumberThree.text = counter
    }
}