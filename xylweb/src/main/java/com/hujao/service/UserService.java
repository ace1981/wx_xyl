package com.hujao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hujao.common.JSON;
import com.hujao.common.JedisManager;
import com.hujao.po.UserEntity;
import com.hujao.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public UserEntity getById(String id){
		if(JedisManager.getInstance().Get(id)!=null)
		{
			//取缓存
			return JSON.toBean(JedisManager.getInstance().Get(id),UserEntity.class);
		}
		return userRepository.getById(id);
	}
	public UserEntity add(UserEntity model){
		model=userRepository.add(model);
		//缓存
		JedisManager.getInstance().Set(model.getId(), JSON.toJson(model));
		return model;
	}
}
