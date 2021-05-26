package com.example.android.pb_rj

//class Presenter( val view: View, val model: Model) {
class Presenter( val view: MainView) {

    val model = Model()

    fun counterClick(id : Int) {
        when(id) {
            0 -> {
                val nextValue = model.next(0)
                view.setButtonText(0, nextValue.toString())
            }
            1 -> {
                val nextValue = model.next(1)
                view.setButtonText(1, nextValue.toString())
            }
            2 -> {
                val nextValue = model.next(2)
                view.setButtonText(2, nextValue.toString())
            }
        }
    }

}