package Emp.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Emp.entity.entity;
import Emp.service.Empservice;
import jakarta.servlet.http.HttpSession;

@Controller
public class labour {
	
    
  //  public Empservice service;
	@GetMapping ("/home")
	public String newform() {
		System.out.print("index mei");

		return "index";
	}
	@GetMapping("/addemp")
	public String addemp(){
		System.out.print("lhglh");
		return "addemp" ;
	}
	@PostMapping("/register")
	 public String regisEmp(@ModelAttribute entity  e) {
//	service.addEmp(e);
		 System.out.println(e);
		 
		 
		 return "addemp";
	 }
	

}
