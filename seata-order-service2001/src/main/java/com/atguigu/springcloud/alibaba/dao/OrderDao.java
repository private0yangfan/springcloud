package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @date 2021/12/15 0015
 */
@Mapper
public interface OrderDao {
    // 1.新建订单
    void create(Order order);

    // 2.修改订单状态
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
