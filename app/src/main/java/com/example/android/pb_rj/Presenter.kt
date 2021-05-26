package com.example.android.pb_rj

class Presenter( val view: View, val model: Model) {

    fun incrementCounter(counterNo : Int) {
        model.incremenetCounter(counterNo)
    }

}