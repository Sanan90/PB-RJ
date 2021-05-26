package com.example.android.pb_rj

//class Presenter( val view: View, val model: Model) {
class Presenter( val view: MainView) {

    val model = Model()

    fun counterClick(id : Int) {
        when(id) {
            R.id.button_one -> {
                val nextValue = model.next(0)
                view.setButtonText(0, nextValue.toString())
            }
            R.id.button_two -> {
                val nextValue = model.next(1)
                view.setButtonText(1, nextValue.toString())
            }
            R.id.button_three -> {
                val nextValue = model.next(2)
                view.setButtonText(2, nextValue.toString())
            }
        }





//    fun incrementCounter(counterNo : Int) {

//        counterNo
//            .let (model::incremenetCounter)
//            .let { counter -> view.showCounter(counterNo, counter) }
//
//        view.showCounter(counterNo, model.incremenetCounter(counterNo))
    }

}