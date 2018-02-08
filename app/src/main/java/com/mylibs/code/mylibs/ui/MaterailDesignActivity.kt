package com.mylibs.code.mylibs.ui

import android.content.Intent
import android.view.View
import com.mylibs.code.mylibs.R
import com.mylibs.code.mylibs.ui.materail.NavigationActivity
import com.mylibs.code.mylibs.ui.materail.ScrollingActivity
import kotlinx.android.synthetic.main.activity_materail_design.*

class MaterailDesignActivity : BaseActivity() {
    override fun getLayout(): Int {
        return R.layout.activity_materail_design
    }

    override fun init() {
        mBack.setOnClickListener({ onBackPressed() })//返回
    }

    fun click(v: View?) {
        when (v?.id) {
            R.id.mToNavigation -> startActivity(Intent(this, NavigationActivity::class.java))
            R.id.mToScrolling -> startActivity(Intent(this, ScrollingActivity::class.java))
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

}
