package com.DSDAAA.service.impl;

import com.DSDAAA.client.UserFeignClient;
import com.DSDAAA.domain.Order;
import com.DSDAAA.domain.User;
import com.DSDAAA.domain.vo.OrderUserVO;
import com.DSDAAA.mapper.OrderMapper;
import com.DSDAAA.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    private UserFeignClient userFeignClient;

    @Override
    public OrderUserVO findOrderByOrderId(Long orderId) {
        Order order = orderMapper.selectById(orderId);
        User user = userFeignClient.queryById(order.getUser_id());
        OrderUserVO orderUserVO = toOrderUserVO(order, user);
        return orderUserVO;
    }

    @Override
    public OrderUserVO toOrderUserVO(Order order, User user) {
        OrderUserVO orderUserVO = new OrderUserVO();
        orderUserVO.setUser(user);
        orderUserVO.setId(order.getId());
        orderUserVO.setUser_id(order.getUser_id());
        orderUserVO.setPrice(order.getPrice());
        orderUserVO.setName(order.getName());
        orderUserVO.setNum(order.getNum());
        return orderUserVO;
    }
}




