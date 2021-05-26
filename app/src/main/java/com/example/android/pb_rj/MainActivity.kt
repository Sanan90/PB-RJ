package com.example.android.pb_rj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import com.example.android.pb_rj.databinding.ActivityMainBinding
import java.util.zip.Inflater
import android.view.View

class MainActivity : AppCompatActivity(), MainView {


    var vb: ActivityMainBinding? = null
    val presenter = Presenter(view = this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        val listener = View.OnClickListener {
            presenter.counterClick(it.id)
        }

        vb?.buttonOne?.setOnClickListener(listener)
        vb?.buttonTwo?.setOnClickListener(listener)
        vb?.buttonThree?.setOnClickListener(listener)
    }

    override fun setButtonText(index: Int, text: String) {
        when (index) {
            0 -> vb?.buttonOne?.text = text
            1 -> vb?.buttonTwo?.text = text
            2 -> vb?.buttonThree?.text = text
        }
    }





//    var vb : ActivityMainBinding? = null
//    val presenter = Presenter(view = this,model = Model())
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        vb = ActivityMainBinding.inflate(layoutInflater)
//
//        vb?.buttonOne?.setOnClickListener {
//            presenter.incrementCounter(0)
//        }
//
//        vb?.buttonTwo?.setOnClickListener {
//            presenter.incrementCounter(1)
//        }
//
//        vb?.buttonThree?.setOnClickListener {
//            presenter.incrementCounter(2)
//        }
//
//        setContentView(vb?.root)
//
//    }
//
//    override fun showCounter(counterNo : Int, counter : Int) {
//        when (counterNo) {
//            0 -> vb?.buttonOne?.text = "$counter"
//            1 -> vb?.buttonTwo?.text = "$counter"
//            2 -> vb?.buttonThree?.text = "$counter"
//        }
//    }
}