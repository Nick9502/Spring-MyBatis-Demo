package com.nickthedev.mybatis.sbmybatisdemo.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.nickthedev.mybatis.sbmybatisdemo.model.Teachers;

@Mapper
public interface TeacherMapper {

	@Select("select * from teachers")
	List<Teachers> findAll(); 
	
	/* SelectKey - AutoGenerate Key value in MyBatis */
	@Insert("insert into teachers(id,name,salary) values(#{id},#{name},#{salary})")
	@SelectKey(statement = "SELECT_LAST_INSERT_ID()", keyProperty = "id",
	before = false, resultType=Integer.class)
	void insert(Teachers teacher);

}