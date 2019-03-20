package zttc.itat.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	//RequestMapping表示用那个url来对应
	@RequestMapping({"/hello","/"})
	public String hello(String username,Model model) {
		System.out.println("hello");
		model.addAttribute("username", username);
		//此时用那个作为key?它默认是使用对象的类型作为key-->model.addAttribute("string",username)
		//model.addAttribute(new User());-->addAtt("user",new User());
		model.addAttribute(username);//不能为空
		System.out.println(username);
		return "hello";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
}
