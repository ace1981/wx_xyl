package com.platform.entity;

import java.util.Date;

import lombok.Data;

@Data
public class UserExtEntity {
	 String id;
	 String user_id;
	 String class_id;
	 String info_type;//'0 人物生平 1 人物评价 2 人物事迹',
	 String creator_id;
	 Date create_time;
	 String content;
	 String remark;
	 String state;
}
