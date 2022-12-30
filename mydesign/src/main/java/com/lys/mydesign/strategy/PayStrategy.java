package com.lys.mydesign.strategy;

public interface PayStrategy {

    /**
     * 支持哪种支付
     * @param type
     * @return
     */
    boolean supports(String type);

    /**
     * 为某个订单展示收银台页面
     * @return
     */
    String cashierPage();

    String getType();
}
