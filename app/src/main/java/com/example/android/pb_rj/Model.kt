package com.example.android.pb_rj

class Model {

    val counters = mutableListOf(0, 0, 0)

    fun incremenetCounter(counterNo : Int) {
        ++counters[counterNo]
    }
}