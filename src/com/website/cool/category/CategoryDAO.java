package com.website.cool.category;

import java.util.List;


public interface CategoryDAO {

	
	public void addCategory();
	
	public List<CategoryVO> getAllCategory();
	
	public CategoryVO getCategory(Integer id);
	
	public void updateCategory(CategoryVO categoryVO);
	
	public void deleteCategory(Integer id);
}
