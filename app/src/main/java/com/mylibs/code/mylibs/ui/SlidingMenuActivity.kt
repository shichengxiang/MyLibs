package com.mylibs.code.mylibs.ui

import com.mylibs.code.mylibs.R
import kotlinx.android.synthetic.main.activity_sliding_menu.*

class SlidingMenuActivity : BaseActivity() {
    override fun getLayout(): Int {
        return R.layout.activity_sliding_menu
    }

    override fun init() {
        mToggleMenu.setOnClickListener({ mSlideMenu.toggle() })
    }

    override fun onBackPressed() {
        if (mSlideMenu != null && mSlideMenu.closeSideMenu()) {
            return
        }
        super.onBackPressed()
    }
}
