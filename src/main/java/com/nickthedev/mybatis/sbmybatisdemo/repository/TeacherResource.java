package com.nickthedev.mybatis.sbmybatisdemo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nickthedev.mybatis.sbmybatisdemo.mappers.TeacherMapper;
import com.nickthedev.mybatis.sbmybatisdemo.model.Teachers;


@RestController 
@RequestMapping("/rest/teachers")
public class TeacherResource {
	
	@Autowired
	private TeacherMapper teacherMapper;
	

	@GetMapping("/all")
	public List<Teachers> getAll() {
		return teacherMapper.findAll(); 
	}
	
	@GetMapping("/update")
	public List<Teachers> update() {
		Teachers teacher = new Teachers();
		teacher.setId(04);
		teacher.setName("Cyborg");
		teacher.setSalary(101);
		
		return teacherMapper.findAll(); 
	}
}
