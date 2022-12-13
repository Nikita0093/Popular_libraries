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
        setContentView(binding.root)

        with(binding) {
            btnNumberOne.setOnClickListener {
                presenter.onCounterClick(R.id.btnNumberOne)
            }

            btnNumberTwo.setOnClickListener {
                presenter.onCounterClick(R.id.btnNumberTwo)
            }

            btnNumberThree.setOnClickListener {
                presenter.onCounterClick(R.id.btnNumberThree)
            }
        }


    }

    private fun initPresenter() {
        presenter = CountersPresenter(this)
    }

    override fun setText(counter: String, id: Int) {
        with(binding) {
            when (id) {
                0 -> tvTextNumberOne.text = counter
                1 -> tvTextNumberTwo.text = counter
                2 -> tvTextNumberThree.text = counter
            }

        }


    }
}