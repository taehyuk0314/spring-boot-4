package com.example.web.mbr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberCtrl {
	@Autowired IMemberService service;
	@GetMapping("/")
	public String displayStartPage(Model model) {
		System.out.println("===1===");
		String num = service.countAll();
		//model.addAttribute("msg","총회원수는"+num+"이다");
		System.out.println("총회원수는"+num+"이다");
		return "index";
	}
}
