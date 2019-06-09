package vn.localguides.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.localguides.model.AppUser;
import vn.localguides.service.IUserService;
@Controller
public class HomeWorkerController {
	@Autowired
	IUserService userService;
	private AppUser worker; 
	
	private AppUser getUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		return userService.findOne(name);
	}
	
	@GetMapping("/worker-space")
	public String Home(Model model) {
		worker=getUser();
		model.addAttribute("worker",worker);
		return "/worker/home";
	}
	@GetMapping("/worker-space/home")
	public String Home1(Model model) {
		worker=getUser();
		model.addAttribute("worker",worker);
		return "/worker/home";
	}
	@GetMapping("/worker-space/worker-profile")
	public String worker_profile(Model model) {
		model.addAttribute("worker", worker);
		return "/worker/profile";
	}
	@GetMapping("/worker-space/change-password")
	public String worker_change_password(Model model) {
		model.addAttribute("worker", worker);
		return "/worker/changepwd";
	}
	
	@PostMapping("/worker-space/save-password")
	public String change_password_save(@Valid AppUser _worker, BindingResult result, RedirectAttributes redirect) 
	{
		return "/worker/changepwdOK";
	}
}
