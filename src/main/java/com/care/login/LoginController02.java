package com.care.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController02 {
	
	@GetMapping("form")
	public String form() {
		return "login/form";
	}
	
	@PostMapping("login_chk")
	public String loginChk(@RequestParam String id,
						@RequestParam String pwd,
						HttpSession session) {
		
		String DBId="1", DBPwd="1", nick="a";
		
		if(id.equals(DBId) && pwd.equals(DBPwd)) {
			// �α��� ������ ������ ����� ��
			session.setAttribute("id", DBId);
			session.setAttribute("nick", nick);
			
			return "redirect:main";
		}
		return "redirect:form";
	}
	
	@GetMapping("main")
	public String main(Model model) {
		model.addAttribute("id", "abcde");	// Ű ���� ũ�� : model < session
		return "login/main";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession se01,
						HttpServletRequest req) {
		
		HttpSession se02 = req.getSession();
		
		//session�� �޾ƿ��� ���
		System.out.println("se01 : "+ se01.getAttribute("nick"));
		System.out.println("se02 : "+ se02.getAttribute("nick"));
		
		se02.invalidate();	// session ����
		
		return "redirect:form";
	}
}
