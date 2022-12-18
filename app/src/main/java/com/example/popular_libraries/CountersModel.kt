package com.example.popular_libraries

class CountersModel {

    private val counters = mutableListOf(0, 0, 0)

    fun getCurrent(position: Int): Int {
        return counters[position]
    }


    fun nextPositionOne(): String {

        return counters[0]++.toString()
    }

    fun nextPositionTwo(): String {

        return counters[1]++.toString()
    }

    fun nextPositionThree(): String {

        return counters[2]++.toString()
    }


    fun set(position: Int, value: Int): Boolean {

        counters[position] = value

        return true
    }
}