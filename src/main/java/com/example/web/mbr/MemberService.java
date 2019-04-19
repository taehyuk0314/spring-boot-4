package com.example.web.mbr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.mapper.MemberMapper;

@Service
public class MemberService implements IMemberService{
	@Autowired MemberMapper map;
	@Override
	public String countAll() {
		System.out.println("=====서비스 내부로 진입함=====");
		String num = map.countAll();
		System.out.println("서비스에서 판단할 인원수는"+num);
		return num;
	}
}
