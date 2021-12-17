package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @date 2021/12/7 0007
 */
@RestController
public class OrderConsulController {
    public static final String invoke_url="http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value="/consumer/payment/consul")
    public String paymentInfo(){
        String result= restTemplate.getForObject(invoke_url+"/payment/consul",String.class);
        return result;
    }
}
