package com.platform.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	// 主键
	private String id;
	// 会员名称
	private String username;
	// 会员密码
	private String password;
	// 性别
	private Integer sex;
	// 出生日期
	private Date birthday;
	// 注册时间
	private Date register_time;
	// 最后登录时间
	private Date last_login_time;
	// 最后登录Ip
	private String last_login_ip;
	// 会员等级
	private Integer user_level_id;
	// 别名
	private String nickname;
	// 手机号码
	private String mobile;
	// 注册Ip
	private String register_ip;
	// 头像
	private String avatar;
	// 单位
	private String company;
	// 微信Id
	private String weixin_openid;
	// 微信Id
	private String weixin_unionid;
	// 所在城市
	private String city;

}
