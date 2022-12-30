package com.lys.mydesign.controller;

import com.lys.mydesign.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PayController {

    @Autowired
    PayService payService;

    /**
     * 微信、支付宝收银台
     * @param type
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/pay/order")
    public String generatePayPage(@RequestParam("type") String type){
        //来到支付收银台页
        String page = payService.payPage(type);
        return page;
    }
}
