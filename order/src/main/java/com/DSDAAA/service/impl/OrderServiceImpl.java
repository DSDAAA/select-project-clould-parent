package com.DSDAAA.service.impl;

import com.DSDAAA.domain.Order;
import com.DSDAAA.mapper.OrderMapper;
import com.DSDAAA.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 13180
 * @description 针对表【tb_order】的数据库操作Service实现
 * @createDate 2023-10-24 11:50:33
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
        implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order findOrderByOrderId(Long orderId) {
        return orderMapper.selectById(orderId);
    }
}




