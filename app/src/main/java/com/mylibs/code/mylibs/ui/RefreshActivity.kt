package com.mylibs.code.mylibs.ui

import android.os.Handler
import com.lcodecore.tkrefreshlayout.RefreshListenerAdapter
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout
import com.lcodecore.tkrefreshlayout.header.progresslayout.ProgressLayout
import com.mylibs.code.mylibs.R
import kotlinx.android.synthetic.main.activity_refresh.*

class RefreshActivity : BaseActivity() {

    override fun getLayout() = R.layout.activity_refresh
    override fun init() {
//        val footView = LoadingView(this)
        with(mRefreshLayout) {
            setOverScrollRefreshShow(true)
            setEnableRefresh(true)
            setHeaderView(ProgressLayout(this@RefreshActivity))
            setEnableLoadmore(true)
//            setBottomView(footView)
//            onFinishLoadMore()
//            setAutoLoadMore(true)
            setOnRefreshListener(object : RefreshListenerAdapter() {
                override fun onRefresh(refreshLayout: TwinklingRefreshLayout?) {
                    super.onRefresh(refreshLayout)
                    Handler().postDelayed({ mRefreshLayout.finishRefreshing() }, 2000)
                }

                override fun onLoadMore(refreshLayout: TwinklingRefreshLayout?) {
                    super.onLoadMore(refreshLayout)
                    Handler().postDelayed({ mRefreshLayout.finishLoadmore() }, 2000)
                }

            })
        }
    }
}
