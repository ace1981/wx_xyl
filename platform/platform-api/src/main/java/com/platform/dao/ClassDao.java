package com.platform.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.platform.entity.ClassEntity;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ClassDao extends BaseDao<ClassEntity> {

	/*// 主键
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
		*/
	//使用@Insert注解指明add方法要执行的SQL  
    @Insert("insert into xyl_class(class_name, creator_id,create_time,class_desc,invite_code,monitor_id,class_pic) values(#{class_name}, #{creator_id},#{create_time},#{class_desc},#{invite_code},#{monitor_id},#{class_pic})")  
    @SelectKey(statement = "select uuid()", keyProperty = "classentity.id", before = false, resultType = int.class)
    public int add(ClassEntity classentity);  
      
    //使用@Delete注解指明deleteById方法要执行的SQL  
    @Delete("delete from xyl_class where id=#{id}")  
    public int deleteById(String id);  
      
    //使用@Update注解指明update方法要执行的SQL  
    @Update("update xyl_class set class_name=#{class_name}, creator_id=#{creator_id},create_time=#{create_time},class_desc=#{class_desc},invite_code=#{invite_code},monitor_id=#{monitor_id},class_pic=#{class_pic}  where id=#{id}")  
    public int update(ClassEntity user);  
      
    //使用@Select注解指明getById方法要执行的SQL  
    @Select("select * from xyl_class where id=#{id}")  
    public ClassEntity getById(String id);  
      
    //使用@Select注解指明getAll方法要执行的SQL  
    @Select("select * from xyl_class")  
    public List<ClassEntity> getAll();  
}
