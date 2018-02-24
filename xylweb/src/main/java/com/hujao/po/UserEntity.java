package com.hujao.po;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
@Data
@Entity
@Table(name = "xyl_user")
public class UserEntity {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	String id;
	// 会员名称
	@Column
	private String username;
	// 会员密码
	@Column
	private String password;
	// 性别
	@Column
	private Integer sex;
	// 出生日期
	@Column
	private Date birthday;
	// 注册时间
	@Column
	private Date register_time;
	// 最后登录时间
	@Column
	private Date last_login_time;
	// 最后登录Ip
	@Column
	private String last_login_ip;
	// 会员等级
	@Column
	private Integer user_level_id;
	// 别名
	@Column
	private String nickname;
	// 手机号码
	@Column
	private String mobile;
	// 注册Ip
	@Column
	private String register_ip;
	// 头像
	@Column
	private String avatar;
	// 单位
	@Column
	private String company;
	// 微信Id
	@Column
	private String weixin_openid;
	// 微信Id
	@Column
	private String weixin_unionid;
	// 所在城市
	@Column
	private String city;
}
