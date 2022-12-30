package com.lys.mydesign.strategy.impl;

import com.lys.mydesign.PayTypeEnum;
import com.lys.mydesign.strategy.PayStrategy;
import org.springframework.stereotype.Component;

@Component
public class WeixinStrategy implements PayStrategy {


    @Override
    public String getType() {
        return PayTypeEnum.Weixin.getPayType();
    }

    @Override
    public boolean supports(String type) {
        return PayTypeEnum.Weixin.getPayType().equalsIgnoreCase(type);
    }

    @Override
    public String cashierPage() {
        System.out.println("跳转到微信页面");
        return "微信页面";
    }
}
