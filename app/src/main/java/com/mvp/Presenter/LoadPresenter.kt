package com.mvp.Presenter

import com.mvp.model.IModle
import com.mvp.model.LoadModel
import com.mvp.view.IView
import com.mvp.view.LoadActivity
import dagger.Module
import dagger.Provides
import java.util.*

/**
 * Created by ZG
 */
interface View_Presenter {

    fun getAdapter();

}

interface Model_Presenter {

    fun getData(list: ArrayList<HashMap<String, Any>>);

    fun noData()

    fun showLoading()

    fun hideLoading()

    fun noInternet()
}

class LoadPresenter(loadactivity: LoadActivity) : View_Presenter, Model_Presenter {

    var view: IView = loadactivity
    var modle: IModle = LoadModel()

    override fun getAdapter() {
        modle.setAdapter(this)
    }

    override fun getData(list: ArrayList<HashMap<String, Any>>) {
        view.setAdapter(list)
        view.hideLoading()

    }

    override fun showLoading() {
        view.showLoading()
    }

    override fun hideLoading() {
        view.hideLoading()
    }

    override fun noInternet() {
        view.noInternet()
    }

    override fun noData() {
        view.noData()
    }
}