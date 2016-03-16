package com.mvp.view

import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.mvp.Presenter.LoadPresenter
import com.mvp.R
import com.mvp.tools.adapter.LoadAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.include_nodata.*
import kotlinx.android.synthetic.main.include_nointernet.*
import org.jetbrains.anko.onClick
import org.jetbrains.anko.toast
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.support.v4.onRefresh
import java.util.*
import javax.inject.Inject


interface IView {
    fun setAdapter(list: ArrayList<HashMap<String, Any>>)

    fun showLoading()

    fun hideLoading()

    fun noInternet()

    fun noData()
}

class LoadActivity : AppCompatActivity(), IView {

    var mPresenter = LoadPresenter(this)

    lateinit var mLinearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mLinearLayoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = mLinearLayoutManager

        swiperefresh.setColorSchemeResources(R.color.colorPrimary)
        swiperefresh.setSize(SwipeRefreshLayout.DEFAULT)
        swiperefresh.setProgressBackgroundColorSchemeResource(R.color.white)

        mPresenter.getAdapter()

        //        recyclerview.onClick { mPresenter.getAdapter() }

        ll_nointernet.onClick { mPresenter.getAdapter() }

        swiperefresh.onRefresh { mPresenter.getAdapter() }

        toast("123")

        //跳转
        //                startActivity<LoadActivity>()

    }

    override fun setAdapter(list: ArrayList<HashMap<String, Any>>) {
        //        val mAdapter = LoadAdapter(list)
        recyclerview.adapter = LoadAdapter(list)

    }

    override fun showLoading() {
        swiperefresh.post { swiperefresh.isRefreshing = true }
        recyclerview.visibility = View.GONE;
        ll_nointernet.visibility = View.GONE;
        ll_nodata.visibility = View.GONE;

    }

    override fun hideLoading() {
        swiperefresh.isRefreshing = false
        recyclerview.visibility = View.VISIBLE;
    }


    override fun noInternet() {
        swiperefresh.visibility = View.GONE
        recyclerview.visibility = View.GONE;
        ll_nointernet.visibility = View.VISIBLE
    }

    override fun noData() {
        swiperefresh.visibility = View.GONE
        recyclerview.visibility = View.GONE;
        ll_nodata.visibility = View.VISIBLE
    }

}
