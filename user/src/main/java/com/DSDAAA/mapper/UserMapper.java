package com.DSDAAA.mapper;

import com.DSDAAA.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 13180
 * @description 针对表【tb_user】的数据库操作Mapper
 * @createDate 2023-10-24 11:51:10
 * @Entity generator.domain.TbUser
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}




