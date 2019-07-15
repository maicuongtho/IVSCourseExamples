package jp.ivs.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/admincp")
public class HomeAdminController {
	@RequestMapping("/home")
	public String index() {
		
		return "admin/home";
	}
	
	@RequestMapping("/login")
	public String Login() {
		return "login";
	}
}
