package ivs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    public String hello(ModelMap model) {
        
        model.addAttribute("greeting", "Hello Spring MVC");
        
        return "helloworld";
        
    }
}
