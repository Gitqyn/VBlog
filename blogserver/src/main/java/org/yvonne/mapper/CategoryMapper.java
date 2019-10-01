package org.yvonne.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yvonne.bean.Category;

import java.util.List;

/**
 * Created by yvonne
 */
@Mapper
public interface CategoryMapper {
    List<Category> getAllCategories();

    int deleteCategoryByIds(@Param("ids") String[] ids);

    int updateCategoryById(Category category);

    int addCategory(Category category);
}
