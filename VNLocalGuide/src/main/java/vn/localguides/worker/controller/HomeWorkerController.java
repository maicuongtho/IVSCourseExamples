package vn.localguides.worker.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeWorkerController {
	
	@GetMapping("/worker-space")
	public String Home() {
	
		return "/worker/home";
	}
	@GetMapping("/worker-space/home")
	public String Home1() {
		return "/worker/home";
	}
	@GetMapping("/worker-space/worker-profile")
	public String worker_profile(Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		model.addAttribute("name", name);
		return "/worker/profile";
	}
}
