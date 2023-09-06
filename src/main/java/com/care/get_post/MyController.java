package com.care.get_post;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/my")	// 공통된 경로
public class MyController {
	
	public MyController() {
		System.out.println("생성자 실행~");
	}
	
	@RequestMapping("index")
	public String index() {
		return "get_post/index";
	}

	@RequestMapping(value="result", method=RequestMethod.GET)
	public String result(HttpServletRequest req, Model model) {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		
		System.out.println("전송방식 : "+ req.getMethod());
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("method", req.getMethod());
		
		return "get_post/result";
	}
	
	@PostMapping("result")
	public String resultPost(@RequestParam String name, 
						@RequestParam("age") int a,
						HttpServletRequest req, Model model) {
		
		// 저장하는 변수와 이름이 같으면 name처럼 사용하고
		// 저장하는 변수와 변수의 이름이 다르면 int a 처럼 명시해주면 된다

		model.addAttribute("name", name);
		model.addAttribute("age", a);
		model.addAttribute("method", req.getMethod());
	
		return "get_post/result";
	}
	
	@PostMapping("dto")
	public String dto(MyDTO dto, Model model) {
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
		System.out.println(dto.getAddr());
		
		model.addAttribute("dto", dto);
		
		return "get_post/dto";
	}
	
	
	
	
	
	
}
