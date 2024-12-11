package com.sky.mapper;

import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {

   @Update("update category set type = #{type},name=#{name},sort=#{sort}," +
           "update_time = #{updateTime},update_user = #{updateUser} where id = #{id}")
   void update(Category category);

   List<Category> select(CategoryPageQueryDTO categoryPageQueryDTO);

   @Update("update category set status = #{status},update_time = #{updateTime},update_user = #{updateUser} where id = #{id}")
   void status(Category category);

   @Insert("insert into category (type, name, sort, status, create_time, update_time, create_user, update_user) VALUES " +
           "(#{type},#{name},#{sort},#{status},#{createTime},#{updateTime},#{createUser},#{updateUser})")
   void insert(Category category);

   @Delete("delete from category where id = #{id}")
   void deleteById(Integer id);

   List<Category> selectByType(Integer type);
}
