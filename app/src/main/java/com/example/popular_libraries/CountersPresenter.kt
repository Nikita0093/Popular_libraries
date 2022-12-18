package com.example.popular_libraries

class CountersPresenter(private val view: MainView) {

    private val model = CountersModel()

    fun onCounterClick(id: Int) {

        when (id) {
            R.id.btnNumberOne -> {
                view.setText(model.next(0).toString(), 0)
            }
            R.id.btnNumberTwo -> {
                view.setText(model.next(1).toString(), 1)
            }
            R.id.btnNumberThree -> {
                view.setText(model.next(2).toString(), 2)
            }
        }
    }
}