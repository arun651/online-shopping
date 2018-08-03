package com.arn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value={"/", "/home", "/index"})
	public ModelAndView index() {
		
		System.out.println("i m here");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring MVC");
		return mv;
	}
	
//	-- DEMO USING @RequestParam ANNOTATION
//	@RequestMapping("/test")
//	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting){
//		System.out.println("i m here");
//		if(greeting == null){
//			greeting = "Hello there";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}

//	-- DEMO USING @PathVariable ANNOTATION
//	@RequestMapping("/test/{greeting}")
//	public ModelAndView test(@PathVariable("greeting") String greeting){
//		System.out.println("i m here");
//		if(greeting == null){
//			greeting = "Hello there";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}


}
