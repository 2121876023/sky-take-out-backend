package com.sky.mapper;

import com.sky.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CategoryMapper {

   @Update("update category set type = #{type},name=#{name},sort=#{sort}," +
           "update_time = #{updateTime},update_user = #{updateUser} where id = #{id}")
   void update(Category category);
}