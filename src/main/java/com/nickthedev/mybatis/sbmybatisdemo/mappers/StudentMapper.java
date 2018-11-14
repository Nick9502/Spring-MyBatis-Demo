package com.nickthedev.mybatis.sbmybatisdemo.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.nickthedev.mybatis.sbmybatisdemo.model.Students;

@Mapper
public interface StudentMapper {

	@Select("select *from students")
	List<Students> findAll(); 
	
	@Select("select *from students where sname=#{name}")
	List<Students> findTarget(); 
	
	@Insert("insert into students(rollno,sname,student_role) values(#{rollno},#{sname},#{student_role})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
    before = false, resultType = Integer.class)
	void insert(Students student);

}
 