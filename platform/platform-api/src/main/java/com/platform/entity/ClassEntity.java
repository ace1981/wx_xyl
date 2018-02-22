package com.platform.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ClassEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	// 主键
	private String id;
	// 班级名称
	private String class_name;
	// 创建人ID
	private String creator_id;
	// 创建时间
	private Date create_time;
	// 班级描述
	private String class_desc;
	// 邀请码
	private String invite_code;
	// 班长ID
	private String monitor_id;
	// 班级头像
	private String class_pic;
}
