package group_maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value="/greeting")
	public String sayHello(Model model) {
		
		model.addAttribute("greetingId", "Hello Kiran World");
		return "hey kiran";
	}
}
