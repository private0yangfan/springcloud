package com.atguigu.springcloud.alibaba.service;


import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
/**
 * @author Administrator
 * @date 2021/12/16 0016
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}


