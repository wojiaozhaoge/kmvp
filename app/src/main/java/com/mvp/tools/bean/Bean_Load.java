package com.mvp.tools.bean;

import java.util.List;

/**
 * Created by ZG
 */
public class Bean_Load {
    public Boolean status;//获取状态
    public String partnerName;//站点名称
    public String partnerID;//站点ID
    public String WatchID;//手表识别码
    public int version;//apk版本号
    public String apkUrl;//apk更新地址
    public String msg;//错误信息
    public List<data> data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(String partnerID) {
        partnerID = partnerID;
    }

    public String getWatchID() {
        return WatchID;
    }

    public void setWatchID(String watchID) {
        WatchID = watchID;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getApkUrl() {
        return apkUrl;
    }

    public void setApkUrl(String apkUrl) {
        this.apkUrl = apkUrl;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<data> getData() {
        return data;
    }

    public void setData(List<data> data) {
        this.data = data;
    }

    public static class data {
        public String ID;//用户ID
        public String Contact;//操作员
        public String UserType;//人员类型
        public String ContactNumber;//人员编号
        public String LoginStatus;//登录状态
        public String BindingStatus;//绑定状态
        public String OilCardID;//油卡ID
        public String CardNumber;//卡号
        public String CardBalance;//油卡余额

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getContact() {
            return Contact;
        }

        public void setContact(String contact) {
            Contact = contact;
        }

        public String getUserType() {
            return UserType;
        }

        public void setUserType(String userType) {
            UserType = userType;
        }

        public String getContactNumber() {
            return ContactNumber;
        }

        public void setContactNumber(String contactNumber) {
            ContactNumber = contactNumber;
        }

        public String getLoginStatus() {
            return LoginStatus;
        }

        public void setLoginStatus(String loginStatus) {
            LoginStatus = loginStatus;
        }

        public String getBindingStatus() {
            return BindingStatus;
        }

        public void setBindingStatus(String bindingStatus) {
            BindingStatus = bindingStatus;
        }

        public String getOilCardID() {
            return OilCardID;
        }

        public void setOilCardID(String oilCardID) {
            OilCardID = oilCardID;
        }

        public String getCardNumber() {
            return CardNumber;
        }

        public void setCardNumber(String cardNumber) {
            CardNumber = cardNumber;
        }

        public String getCardBalance() {
            return CardBalance;
        }

        public void setCardBalance(String cardBalance) {
            CardBalance = cardBalance;
        }
    }


}
