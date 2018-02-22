package com.platform.service;

import com.platform.dao.UserExtDao;
import com.platform.entity.UserEntity;
import com.platform.entity.UserExtEntity;
import com.platform.utils.RRException;
import com.platform.validator.Assert;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserExtService {
	UserExtDao userExtDao;
	
	public void save(UserExtEntity userVo) {
		 userExtDao.save(userVo);
	}
}
