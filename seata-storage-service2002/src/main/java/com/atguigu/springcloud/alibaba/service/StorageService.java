package com.atguigu.springcloud.alibaba.service;

/**
 * @author Administrator
 * @date 2021/12/16 0016
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}

