package com.mvp.tools.retrofit

import com.mvp.tools.bean.Bean_Load
import com.mvp.tools.bean.Bean_Load_kt
import retrofit2.http.POST
import retrofit2.http.Query
import rx.Observable

/**
 * Created by ZG
 */
class LoadInterface {

    interface LoadService {
        @POST("UserList/")
        fun PostLoad(@Query("token") MyChannelId: String): Observable<Bean_Load_kt>

    }
}