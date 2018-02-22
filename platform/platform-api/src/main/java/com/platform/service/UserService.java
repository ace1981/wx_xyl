package com.platform.service;

import com.platform.dao.UserDao;
import com.platform.entity.UserEntity;
import com.platform.utils.RRException;
import com.platform.validator.Assert;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Service
public class UserService {
    @Autowired
    private UserDao userDao;
  
    public UserEntity queryObject(Long userId) {
        return userDao.queryObject(userId);
    }

    public UserEntity queryByOpenId(String openId) {
        return userDao.queryByOpenId(openId);
    }

    public List<UserEntity> queryList(Map<String, Object> map) {
        return userDao.queryList(map);
    }

    public int queryTotal(Map<String, Object> map) {
        return userDao.queryTotal(map);
    }

    public void save(String mobile, String password) {
        UserEntity user = new UserEntity();
        user.setMobile(mobile);
        user.setUsername(mobile);
        user.setPassword(DigestUtils.sha256Hex(password));
        user.setRegister_time(new Date());
        userDao.save(user);
    }

    public void save(UserEntity userVo) {
        userDao.save(userVo);
    }

    public void update(UserEntity user) {
        userDao.update(user);
    }

    public void delete(Long userId) {
        userDao.delete(userId);
    }

    public void deleteBatch(Long[] userIds) {
        userDao.deleteBatch(userIds);
    }

    public UserEntity queryByMobile(String mobile) {
        return userDao.queryByMobile(mobile);
    }

   
   
}
