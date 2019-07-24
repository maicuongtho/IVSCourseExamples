package ntu.thomc.ClientControllers;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class DefaultController {
	@RequestMapping("index")
	public String index() {
		return "client/index";
	}
	
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String login(ModelMap model, HttpServletRequest request ) {
	    // code xử lý nghiệp vụ ở đây 
		return "login";
	}
	// Cách khác để lấy thông tin từ View
//	@RequestMapping(value="login", method = RequestMethod.POST)
//	public String login(ModelMap model, @RequestParam("id") String _id, @RequestParam("password") String _password)
//	{
//		// code xử lý nghiệp vụ ở đây
//		return "login";
//	}
}
