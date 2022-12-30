package com.lys.mydesign.model;

public enum PayTypeEnum {

    Weixin(1, "weixin"),
    Alipay(2, "alipay");

    private int code;
    private String payType;

    public int getCode() {
        return code;
    }

    public String getPayType() {
        return payType;
    }

    PayTypeEnum(int code, String payType) {
        this.code = code;
        this.payType = payType;
    }


}
