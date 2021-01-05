package org.yvonne.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yvonne.bean.Category;
import org.yvonne.mapper.CategoryMapper;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by yvonne
 */
@Service
@Transactional
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> getAllCategories() {
        return categoryMapper.getAllCategories();
    }

    public boolean deleteCategoryByIds(String ids) {
        String[] split = ids.split(",");
        int result = categoryMapper.deleteCategoryByIds(split);
        return result == split.length;
    }

    public int updateCategoryById(Category category) {
        return categoryMapper.updateCategoryById(category);
    }

    public int addCategory(Category category) {
        category.setDate(new Timestamp(System.currentTimeMillis()));
        return categoryMapper.addCategory(category);
    }
}