package com.platform.dao;

import com.platform.entity.UserEntity;
import org.apache.ibatis.annotations.Param;


public interface UserDao extends BaseDao<UserEntity> {
    UserEntity queryByMobile(String mobile);
    UserEntity queryByOpenId(@Param("openId") String openId);
}
