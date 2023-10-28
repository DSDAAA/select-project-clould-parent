package com.DSDAAA.controller;

import com.DSDAAA.domain.User;
import com.DSDAAA.service.UserService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user")
@Slf4j
@RefreshScope
public class UserController {

    @Autowired
    private UserService userService;

//    @Value("${pattern.dateformat}")
    private String pattern;

    @SentinelResource("hot")
    @GetMapping(value = "/findUserByUserId/{userId}")
    public User findUserByUserId(@PathVariable(value = "userId") Long userId, @RequestHeader(name = "Truth") String header) {
        log.info("UserController...findUserByUserId方法执行了... ,header: {} ", header, pattern);
        return userService.findUserByUserId(userId);
    }

    @GetMapping(value = "/updateUserById")
    public String updateUserById() {
        return "修改用户数据成功";
    }

    @GetMapping(value = "/save")
    public String save() {
        userService.queryUsers();
        System.out.println("保存用户");
        return "订单保存成功";
    }

    @GetMapping(value = "/query")
    public String query() {
        userService.queryUsers();
        System.out.println("查询用户");
        return "查询用户成功";
    }
}
