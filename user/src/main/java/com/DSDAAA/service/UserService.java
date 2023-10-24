package com.DSDAAA.service;

import com.DSDAAA.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 13180
 * @description 针对表【tb_user】的数据库操作Service
 * @createDate 2023-10-24 11:51:10
 */

public interface UserService extends IService<User> {
    User findUserByUserId(Long userId);
}
