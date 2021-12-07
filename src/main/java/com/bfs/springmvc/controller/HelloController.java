package com.bfs.springmvc.controller;

import com.bfs.springmvc.config.JdbcConfig;
import com.bfs.springmvc.domain.Account;
//import com.bfs.springmvc.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.bfs.springmvc.domain.Contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/app")
public class HelloController {


//    @RequestMapping(value="/hello", method=RequestMethod.GET)
	@GetMapping("/hello")

	public List<Account> hello(Model model) {
		List<Account> accounts = new ArrayList<>();
//		model.addAttribute("message", "Hello SpingMVC");
		accounts.add(new Account(1,"name1",true));
		accounts.add(new Account(2,"name2",true));
		accounts.add(new Account(3,"name3",false));
		accounts.add(new Account(4,"name4",true));
		accounts.add(new Account(5,"name5",false));


		return accounts;
	}

	@GetMapping("/user/{uid}")
	@ResponseBody
	public String getUser(@PathVariable int uid) {
		return "user id is " + uid;
	}

	
	@GetMapping("/user/100")
	@ResponseBody
	public String getUser_hardcode() {
		return "user id is always 100";
	}
	
	
	@GetMapping("/user2")
	@ResponseBody
	public String getUser2(@RequestParam Integer uid) {
		return "user id is " + uid;
	}
	

	@GetMapping("/user1")
	@ResponseBody
	public String getUser1(@RequestParam(value = "uid", required = false) Optional<Integer> uid) {
		return "user id is " + uid.orElseGet(() -> 0);
	}

//	@GetMapping("/book/{uid}")
//	@ResponseBody
//	public String getBook(@PathVariable int uid) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
//		BookService bookService =  context.getBean("bookService",BookService.class);
//
//
//
//
//		return bookService.getBookById(uid).toString();
//	}

	
}
