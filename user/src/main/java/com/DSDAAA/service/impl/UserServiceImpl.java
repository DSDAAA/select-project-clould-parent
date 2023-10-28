package com.DSDAAA.service.impl;

import com.DSDAAA.domain.User;
import com.DSDAAA.mapper.UserMapper;
import com.DSDAAA.service.UserService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 13180
 * @description 针对表【tb_user】的数据库操作Service实现
 * @createDate 2023-10-24 11:51:10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByUserId(Long userId) {
        return userMapper.selectById(userId);
    }

    @Override
    @SentinelResource("users")
    public void queryUsers() {
        System.err.println("查询用户");
    }
}




