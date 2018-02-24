package com.hujao.repository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hujao.dao.jpa.UserDao;
import com.hujao.dao.mybatis.UserMapper;
 
import com.hujao.po.UserEntity;

@Repository
@Transactional
public class UserRepository {
	@Autowired
	private UserDao userDao;

	@Autowired
	private UserMapper userMapper;

	public UserEntity add(UserEntity model) {
		return userDao.save(model);
	}

	public UserEntity modify(UserEntity model) {
		return  userDao.save(model);
	}

	public UserEntity getById(String id) {
		return  userMapper.getById(id);
	}
}
