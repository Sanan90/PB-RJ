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
            when(it.id) {
                vb?.buttonOne?.id -> presenter.counterClick(0)
                vb?.buttonTwo?.id -> presenter.counterClick(1)
                vb?.buttonThree?.id -> presenter.counterClick(2)
            }
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
}