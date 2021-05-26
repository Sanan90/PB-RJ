package com.example.android.pb_rj

interface MainView {

    /**
     *  функция для отображения счетчика кнопки
     *
     *  @param counter номер счетчика
     *  @param counterNo счетчик
     */

    fun setButtonText(index : Int, text : String)

}