package com.arn.shoppingbackend.dao;

import java.util.List;

import com.arn.shoppingbackend.dto.Category;

public interface CategoryDao {

	List<Category> list();
	Category get(int id);
}
