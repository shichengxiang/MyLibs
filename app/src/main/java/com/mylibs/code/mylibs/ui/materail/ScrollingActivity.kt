package com.mylibs.code.mylibs.ui.materail

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.mylibs.code.mylibs.R
import com.mylibs.code.mylibs.utils.Logz
import kotlinx.android.synthetic.main.activity_scrolling.*

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        app_bar.addOnOffsetChangedListener({appbar,offset->

            Logz.d(" 偏移量==="+offset)
            if(offset>-100)
                mTV.setTextSize(((100+offset+16)/10).toFloat())
        })
    }
}
