package com.DSDAAA.service;

import com.DSDAAA.domain.Order;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 13180
 * @description 针对表【tb_order】的数据库操作Service
 * @createDate 2023-10-24 11:50:33
 */
public interface OrderService extends IService<Order> {
    Order findOrderByOrderId(Long orderId);
}
