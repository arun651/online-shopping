package com.arn.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arn.shoppingbackend.dao.CategoryDao;
import com.arn.shoppingbackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDao categoryDao;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		System.out.println("i m in home");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");

		// passing the list of categories
		mv.addObject("categories", categoryDao.list());

		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		System.out.println("i m in about us");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {

		System.out.println("i m in contact us");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}

	/*
	 * Methods to load all the products and based on category
	 */

	@RequestMapping(value = { "/show/all/products" })
	public ModelAndView showAllProducts() {

		System.out.println("i m in all products");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");

		// passing the list of categories
		mv.addObject("categories", categoryDao.list());

		mv.addObject("userClickAllProducts", true);
		return mv;
	}

	@RequestMapping(value = { "/show/category/{id}/products" })
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {

		System.out.println("i m in category products");
		ModelAndView mv = new ModelAndView("page");
		// categoryDao to fetch a single category

		Category category = null;
		category = categoryDao.get(id);
		mv.addObject("title", category.getName());

		// passing the list of categories
		mv.addObject("categories", categoryDao.list());

		// passing the single category
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}

}

// -- DEMO USING @RequestParam ANNOTATION
// @RequestMapping("/test")
// public ModelAndView test(@RequestParam(value="greeting", required=false)
// String greeting){
// System.out.println("i m here");
// if(greeting == null){
// greeting = "Hello there";
// }
// ModelAndView mv = new ModelAndView("page");
// mv.addObject("greeting", greeting);
// return mv;
// }

// -- DEMO USING @PathVariable ANNOTATION
// @RequestMapping("/test/{greeting}")
// public ModelAndView test(@PathVariable("greeting") String greeting){
// System.out.println("i m here");
// if(greeting == null){
// greeting = "Hello there";
// }
// ModelAndView mv = new ModelAndView("page");
// mv.addObject("greeting", greeting);
// return mv;
// }
