package com.mylibs.code.mylibs.ui

import android.content.Context
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.mylibs.code.mylibs.R
import com.mylibs.code.mylibs.utils.Logz
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun getLayout() =
            R.layout.activity_main

    lateinit var mAdapter: CusAdapter


    override fun init() {
        mAdapter = CusAdapter(this)
        mListView!!.adapter = mAdapter
        var list = listOf<String>("下拉刷新", "侧滑菜单", "版本更新", "viewpager+图片详情",
                "MaterialDisign")
        var acList = listOf<String>("com.mylibs.code.mylibs.ui.RefreshActivity",
                "com.mylibs.code.mylibs.ui.SlidingMenuActivity",
                "com.mylibs.code.mylibs.ui.UpdateAppActivity",
                "com.mylibs.code.mylibs.custom.MainActivity",
                "com.mylibs.code.mylibs.ui.MaterailDesignActivity")
        mListView.setOnItemClickListener { _, _, position, _ ->
            startActivity(Intent(this, Class.forName(acList[position])))
        }
        mAdapter.setData(list)
    }

    class CusAdapter(var context: Context) : BaseAdapter() {
        var mData = listOf<String>()

        init {
            Logz.i("init")
        }

        fun setData(map: List<String>) {
            println("setdata 2")
            mData = map
            notifyDataSetChanged()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var holder: ViewHolder?
            var v: View
            if (p1 == null) {
                v = View.inflate(context, R.layout.item_lv_main, null)
                holder = ViewHolder(v)
                v.tag = holder
            } else {
                v = p1
                holder = v.tag as ViewHolder?
            }
            holder!!.mTitle.text = mData[p0]
//            holder!!.mTitle.setText(mData[p0.toString()])
            return v
        }

        override fun getItem(p0: Int): Any {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getCount(): Int {
            return mData.size
        }

        class ViewHolder(view: View) {
            var mTitle: TextView = view.findViewById(R.id.title) as TextView
        }

    }

}
