package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.web.mapper.MemberMapper;


@SpringBootApplication
@EnableAutoConfiguration
public class Application {
	@Autowired MemberMapper mapper;
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
