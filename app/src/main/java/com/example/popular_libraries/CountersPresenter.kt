package com.example.popular_libraries

class CountersPresenter(private val view: MainView) {

    private val model = CountersModel()


    fun onCounterClickBtnOne() {
        view.setTextBtnOne(model.nextPositionOne())

    }

    fun onCounterClickBtnTwo() {
        view.setTextBtnTwo(model.nextPositionTwo())

    }

    fun onCounterClickBtnThree() {
        view.setTextBtnThree(model.nextPositionThree())

    }
}