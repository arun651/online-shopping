package com.arn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.arn.shoppingbackend.dao.CategoryDao;
import com.arn.shoppingbackend.dto.Category;


@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category  = new Category();
		
//		Adding first value
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("TV Desciption");
		category.setImageUrl("CAT_1.png");
		
		categories.add(category);
		
//		Adding second value
		category  = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Mobile Desciption");
		category.setImageUrl("CAT_2.png");
		
		categories.add(category);
		
//		Adding Third value
		category  = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Laptop Desciption");
		category.setImageUrl("CAT_3.png");
		
		categories.add(category);
		
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// find the category for the id using enhansed for loop
		
		for(Category category: categories){
			if(category.getId() == id){
				return category;
			}
		}
		
		return null;
	}
	
	

}
