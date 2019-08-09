package thomc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import thomc.entity.Contact;
import thomc.service.ContactService;

@Controller
public class ContactController {
	   @Autowired
	    private ContactService contactService;

	    @GetMapping("/contact")
	    public String list(ModelMap model) {
	        model.addAttribute("contacts", contactService.findAll());
	        return "list";
	    }
	    
	    @GetMapping("/contact/{id}/edit")
	    public String edit(@PathVariable("id") Integer id, ModelMap model) {
	        model.addAttribute("contact", contactService.findOne(id));
	        return "formEdit";
	    }
	    
	    @GetMapping("/contact/{id}/delete")
	    public String delete(@PathVariable int id, RedirectAttributes redirect) {
	        contactService.delete(id);
	        redirect.addFlashAttribute("successMessage", "Deleted contact successfully!");
	        return "redirect:/contact";
	    }
	    
	    @GetMapping("/contact/add")
	    public String add(ModelMap model) {
	        model.addAttribute("contact", new Contact());
	        return "form";
	    }
	    @PostMapping("/contact/save")
	    public String save(@Valid Contact contact, BindingResult result, RedirectAttributes redirect) {
	        if (result.hasErrors()) {
	            return "form";
	        }
	        contactService.save(contact);
	        redirect.addFlashAttribute("successMessage", "Saved contact successfully!");
	        return "redirect:/contact";
	    }
	    
	    @PostMapping("/contact/insert")
	    public String insert(@Valid Contact contact, BindingResult result, RedirectAttributes redirect) {
	        if (result.hasErrors()) {
	            return "form";
	        }
	        contactService.insert(contact);
	        redirect.addFlashAttribute("successMessage", "Add new contact successfully!");
	        return "redirect:/contact";
	    }
	    
	    @GetMapping("/contact/search")
	    public String search(@RequestParam("term") String term, ModelMap model) {
	        if (StringUtils.isEmpty(term)) {
	            return "redirect:/contact";
	        }

	        model.addAttribute("contacts", contactService.search(term));
	        return "list";
	    }
}
