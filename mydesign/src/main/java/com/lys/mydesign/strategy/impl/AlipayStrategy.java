package com.lys.mydesign.strategy.impl;

import com.lys.mydesign.PayTypeEnum;
import com.lys.mydesign.strategy.PayStrategy;
import org.springframework.stereotype.Component;

@Component
public class AlipayStrategy implements PayStrategy {

    @Override
    public String getType() {
        return PayTypeEnum.Alipay.getPayType();
    }

    @Override
    public boolean supports(String type) {
        return PayTypeEnum.Alipay.getPayType().equalsIgnoreCase(type);
    }

    @Override
    public String cashierPage() {
        System.out.println("跳转到支付宝页面");
        return "支付宝页面";
    }
}
