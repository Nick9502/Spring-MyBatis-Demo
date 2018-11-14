package com.nickthedev.mybatis.sbmybatisdemo;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nickthedev.mybatis.sbmybatisdemo.model.Students;
import com.nickthedev.mybatis.sbmybatisdemo.model.Teachers;

@MappedTypes({Teachers.class,Students.class})
@MapperScan("com.nickthedev.mybatis.sbmybatisdemo.mappers")
@SpringBootApplication
public class SbMybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMybatisDemoApplication.class, args);
	}
}
