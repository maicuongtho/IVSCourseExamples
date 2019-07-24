package ntu.thomc.EmployeeControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/employee/")
public class DefaultStaffController {
	@RequestMapping("index")
	public String index() {
		return "employee/index";
	}
}
