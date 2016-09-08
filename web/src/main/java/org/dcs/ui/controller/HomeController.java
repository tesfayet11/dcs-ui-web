package org.dcs.ui.controller;

import org.dcs.service.StudentService;
import org.dcs.ui.model.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome to Web Store!");
		model.addAttribute("tagline", "The one and only amazing web store");
		
		
		Student s = createTestStudent();
		studentService.save(s);
		
		return "welcome";
	}
	
	private Student createTestStudent(){
		Student s = new Student();
		s.setFirstName("firstName");
		s.setLastName("lastName");
		return s;
	}
}