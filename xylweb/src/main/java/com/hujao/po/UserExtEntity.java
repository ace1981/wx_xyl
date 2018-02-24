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
@Table(name = "xyl_user_ext")
public class UserExtEntity {
	 @Id
	 @GeneratedValue(generator = "uuid")
	 @GenericGenerator(name = "uuid", strategy = "uuid")
	 String id;
	 @Column
	 String user_id;
	 @Column
	 String class_id;
	 @Column
	 String info_type;//'0 人物生平 1 人物评价 2 人物事迹',
	 @Column
	 String creator_id;
	 @Column
	 Date create_time;
	 @Column
	 String content;
	 @Column
	 String remark;
	 @Column
	 String state;
}
