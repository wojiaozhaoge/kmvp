package com.mvp.tools.bean

/**
 * Created by ZG
 */
class Bean_Load_kt
//(
//        var status: Boolean, //获取状态
//        var partnerName: String, //站点名称
//        var partnerID: String,
//        var watchID: String, //手表识别码
//        var version: Int, //apk版本号
//        var apkUrl: String, //apk更新地址
//        var msg: String, //错误信息
//        var data_load: MutableList<message> = arrayListOf()
//)
{
    var status: Boolean = false //获取状态
    var partnerName: String = "" //站点名称
    var partnerID: String = ""
    var watchID: String = "" //手表识别码
    var version: Int = 0 //apk版本号
    var apkUrl: String = "" //apk更新地址
    var msg: String = "" //错误信息
    var data_load: Array<message> = arrayOf()


    class message
    //(var id: String,
    //                       var contact: String,
    //                       var userType: String,
    //                       var contactNumber: String)
    {
        var id: String = ""//用户ID
        var contact: String = ""//操作员
        var userType: String = ""//人员类型
        var contactNumber: String = ""//人员编号
        var loginStatus: String = ""//登录状态
        var bindingStatus: String = ""//绑定状态
        var oilCardID: String = ""//油卡ID
        var cardNumber: String = ""//卡号
        var cardBalance: String = ""//油卡余额
    }
}