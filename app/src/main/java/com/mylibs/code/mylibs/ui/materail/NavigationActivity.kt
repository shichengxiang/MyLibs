package com.mylibs.code.mylibs.ui.materail

import android.view.Gravity
import com.mylibs.code.mylibs.R
import com.mylibs.code.mylibs.ui.BaseActivity
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : BaseActivity() {
    override fun getLayout() = R.layout.activity_navigation

    override fun init() {
        mLeft.setOnClickListener({
            if (!mDrawerLayout.isDrawerOpen(Gravity.LEFT)){
                mDrawerLayout.openDrawer(Gravity.LEFT)
                mDrawerLayout.closeDrawer(Gravity.RIGHT)
            }
        })
        mRight.setOnClickListener({
            if (!mDrawerLayout.isDrawerOpen(Gravity.RIGHT)){
                mDrawerLayout.openDrawer(Gravity.RIGHT)
                mDrawerLayout.closeDrawer(Gravity.LEFT)
            }
        })
    }

}
