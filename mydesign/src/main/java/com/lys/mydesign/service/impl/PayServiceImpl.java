package com.lys.mydesign.service.impl;

import com.lys.mydesign.service.PayService;
import com.lys.mydesign.strategy.PayStrategy;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * 模板类
 */
@Service
public class PayServiceImpl implements PayService, ApplicationContextAware {


    Map<String, PayStrategy> payStrategyMap;

    @Override
    public String payPage(String type) {
        //1、获得订单步骤
        System.out.println("获得订单");

        //2、跳转到支付页面
        if(payStrategyMap.containsKey(type)) {
            return payStrategyMap.get(type).cashierPage();
        }
        return "unknown";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, PayStrategy> payStrategyMap = applicationContext.getBeansOfType(PayStrategy.class);
        if(!payStrategyMap.isEmpty()) {
            this.payStrategyMap = payStrategyMap.values().stream()
                    .collect(Collectors.toMap(service-> service.getType(), service -> service));
        }
    }
}
