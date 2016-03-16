package com.mvp.model

import android.util.Log
import com.mvp.Presenter.Model_Presenter
import com.mvp.tools.retrofit.LoadInterface
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rx.Observable
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.util.*

/**
 * Created by ZG
 */


interface IModle {
    fun setAdapter(model_persenter: Model_Presenter)
}


class LoadModel : IModle {

    private var list = ArrayList<HashMap<String, Any>>()
    private val url_load = "http://w.cheyuu.com/api/"

    override fun setAdapter(model_persenter: Model_Presenter) {
        list.clear()
        Observable.just("4291864244539110703")
                .flatMap({ s ->
                    val retrofit = Retrofit.Builder()
                            .baseUrl(url_load)
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .build()

                    var service = retrofit.create(LoadInterface.LoadService::class.java)
                    service.PostLoad(s as String)
                })
                .observeOn(AndroidSchedulers.mainThread())
                .filter({ bean_load ->

                    if (!bean_load.status) {
                        model_persenter.noData()
                    }
                    bean_load.status
                })

                //                .map({ bean_load ->
                //                    var hashMap = HashMap<String, Any>()
                //                    hashMap.put("person_name", bean_load.)
                //                    list.add(hashMap)
                //                    Log.v("123", list.toString())
                //                    list
                //                })
                //                .flatMap(object :Func1<Bean_Load,Observable<Bean_Load.message>>{
                //                    override fun call(bean_load: Bean_Load?): Observable<Bean_Load.message>? {
                //                        return Observable.from(bean_load.message)
                //                    }
                //
                //
                //                })

                .flatMap({ bean_load ->

                    Observable.from(bean_load.data_load)
                })
                .observeOn(Schedulers.io())
                .map({ data ->
                    var hashMap = HashMap<String, Any>()
                    hashMap.put("person_name", data.contact)
                    list.add(hashMap)
                    Log.v("ddddd", list.toString())
                    list
                })
                .subscribeOn(Schedulers.io())
                .doOnSubscribe({ model_persenter.showLoading() })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Subscriber<ArrayList<HashMap<String, Any>>>() {
                    override fun onCompleted() {
                    }

                    override fun onError(p0: Throwable?) {
                        model_persenter.noInternet()
                    }

                    override fun onNext(p0: ArrayList<HashMap<String, Any>>?) {


                        model_persenter.getData(p0!!)

                    }
                })
    }

}