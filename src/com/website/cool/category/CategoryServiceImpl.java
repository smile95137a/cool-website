package com.website.cool.category;

import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements CategoryService{

	
	@Autowired
	private CategoryDAO categoryDAO;
}
