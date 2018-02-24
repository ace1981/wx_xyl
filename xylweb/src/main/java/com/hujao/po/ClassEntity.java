package com.hujao.po;

import java.io.Serializable;
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
@Table(name = "xyl_class")
public class ClassEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	// 主键
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	String id;
	// 班级名称
	@Column
	String class_name;
	// 创建人ID
	@Column
	String creator_id;
	// 创建时间
	@Column
	Date create_time;
	// 班级描述
	@Column
	String class_desc;
	// 邀请码
	@Column
	String invite_code;
	// 班长ID
	@Column
	String monitor_id;
	// 班级头像
	@Column
	String class_pic;
}
