package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;

import java.util.List;

public interface CategoryService {
    void update(CategoryDTO categoryDTO);

    PageResult page(CategoryPageQueryDTO categoryPageQueryDTO);

    void status(Long id, Integer status);

    void insert(CategoryDTO categoryDTO);

    void deleteById(Integer id);

    List<Category> selectByType(Integer type);
}
