package com.mylibs.code.mylibs.ui

import com.mylibs.code.mylibs.R
import com.mylibs.code.mylibs.update.AppManager
import com.mylibs.code.mylibs.update.UpdateAppManager

class UpdateAppActivity : BaseActivity() {
    override fun getLayout() = R.layout.activity_update_app

    override fun init() {
        UpdateAppManager.Builder()
                .setActivity(this)
                .setHttpManager(AppManager())
                .setUpdateUrl("http://baidu.com")
                .build().update()
    }
}
