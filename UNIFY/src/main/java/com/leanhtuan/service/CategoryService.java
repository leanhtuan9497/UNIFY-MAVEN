package com.leanhtuan.service;

import java.util.List;

import com.leanhtuan.model.Category;

public interface CategoryService {
	void insert(Category category);

	void edit(Category category);

	void delete(int id);

	Category get(int id);
	
	Category get(String name);

	List<Category> getAll();

	List<Category> search(String username);
}
