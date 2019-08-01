package thomc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import thomc.model.User;
import thomc.mapper.IUserMapper;

@Controller
public class HomeController {
	@Autowired 
	private IUserMapper userMapper;
	
	@RequestMapping("/")
	public String index(ModelMap model) {
		List<User> users = userMapper.findAllUsers();
		 model.addAttribute("lstUser",users);
		model.addAttribute("msg","Hello Uoy");
		return "index";
	}

	
}
