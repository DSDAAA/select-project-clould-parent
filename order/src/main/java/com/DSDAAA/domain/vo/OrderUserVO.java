package com.DSDAAA.domain.vo;

import com.DSDAAA.domain.Order;
import com.DSDAAA.domain.User;
import lombok.Data;

@Data
public class OrderUserVO {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long user_id;
    private String name;
    private Long price;
    private Integer num;
    private User user;
}
