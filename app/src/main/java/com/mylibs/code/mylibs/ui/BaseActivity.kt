package com.mylibs.code.mylibs.ui

import android.app.ProgressDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by shichengxinag on 2018/1/30.
 */
abstract class BaseActivity : AppCompatActivity() {
    var mDialog: ProgressDialog? = null

    abstract fun getLayout():Int

    abstract fun init()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        init()
    }

    fun toast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    fun showLoading() {

    }

    override fun finish() {
        super.finish()
    }

    override fun onStop() {
        super.onStop()
        if(mDialog != null){
            mDialog!!.dismiss()
        }
    }
}