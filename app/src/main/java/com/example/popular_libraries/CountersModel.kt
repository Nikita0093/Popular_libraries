package com.example.popular_libraries

class CountersModel {

    private val counters = mutableListOf(0, 0, 0)

    fun getCurrent(position: Int): Int {
        return counters[position]
    }


    fun next(position: Int): Int {

        return counters[position]++
    }


    fun set(position: Int, value: Int): Boolean{

        counters[position] = value

        return true
    }
}