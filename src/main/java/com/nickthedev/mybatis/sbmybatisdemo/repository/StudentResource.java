package com.nickthedev.mybatis.sbmybatisdemo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nickthedev.mybatis.sbmybatisdemo.mappers.StudentMapper;
import com.nickthedev.mybatis.sbmybatisdemo.model.Students;

@RestController 
@RequestMapping("/rest/students")
public class StudentResource {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@GetMapping("/all")
	public List<Students> getAll() {
		return studentMapper.findAll(); 
	}
	
	//Change to use RequestParamas
	@GetMapping("/add")
	public List<Students> addStudent() {
		Students student = new Students();
		student.setRollno(04);
		student.setSname("Cyborg");
		student.setStudent_role("Graduate");
		studentMapper.insert(student);
		return studentMapper.findAll(); 
	}
	//Change to use RequestParamas
	@GetMapping("/save")
	public @ResponseBody String addNewStudent(@RequestParam int rollno, @RequestParam String name, @RequestParam String role) {
		Students student = new Students();
		student.setRollno(rollno);
		student.setSname(name);
		student.setStudent_role(role);
		studentMapper.insert(student);
		return "Saved New User";
	}
}
