package com.example.android.pb_rj

class Model {

    val counters = mutableListOf(0, 0, 0)

    fun getCurrent(index : Int) = counters[index]

    fun next(index : Int) : Int {
        counters[index]++
        return getCurrent(index)
    }

    fun set(index: Int, value : Int) {
        counters[index] = value
    }
}