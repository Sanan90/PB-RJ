package com.example.android.pb_rj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android.pb_rj.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View {


    var vb : ActivityMainBinding? = null
    val presenter = Presenter(view = this,model = Model())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        vb = ActivityMainBinding.inflate(layoutInflater)

        vb?.buttonOne?.setOnClickListener {
            presenter.incrementCounter(0)
        }

        vb?.buttonTwo?.setOnClickListener {
            presenter.incrementCounter(1)
        }

        vb?.buttonThree?.setOnClickListener {
            presenter.incrementCounter(2)
        }
//
//
//        but_counters2.setOnClickListener {
//            but_counters2.text = (("++$counters[0]"))
//        }
//
//
//        but_counters3.setOnClickListener {
//            but_counters3.text = (("++$counters[0]"))
//        }
        setContentView(vb?.root)

    }

    override fun showCounter(counterNo : Int, counter : Int) {

    }
}