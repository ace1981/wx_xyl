package com.hujao.po;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "xyl_r_user_class")
public class ClassUserRelationEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	String userid;
	@Id
	String classid;
}
