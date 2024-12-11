package com.sky.controller.admin;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/category")
@Slf4j
@Api(tags = "分类相关接口")
public class CategoryController {
    @Autowired
    CategoryService categoryService;


    /**
     * 修改分类信息
     *
     * @param categoryDTO
     * @return
     */
    @PutMapping
    @ApiOperation("修改分类信息")
    public Result update(@RequestBody CategoryDTO categoryDTO) {
        log.info("修改分类信息：{}", categoryDTO);
        categoryService.update(categoryDTO);
        return Result.success();
    }

    @GetMapping("/page")
    @ApiOperation("分类分页查询")
    public Result<PageResult> page(CategoryPageQueryDTO categoryPageQueryDTO) {
        log.info("分类分页查询：{}", categoryPageQueryDTO);
        PageResult categories = categoryService.page(categoryPageQueryDTO);
        return Result.success(categories);
    }

    @PostMapping("/status/{status}")
    @ApiOperation("启用、禁用分类")
    public Result status(Long id, @PathVariable Integer status) {
        log.info("把id为{}的status修改为{}", id, status);
        categoryService.status(id, status);
        return Result.success();
    }

    @PostMapping
    @ApiOperation("新增分类")
    public Result insert(@RequestBody CategoryDTO categoryDTO) {
        log.info("修改分类：{}", categoryDTO);
        categoryService.insert(categoryDTO);
        return Result.success();
    }

    @DeleteMapping
    @ApiOperation("跟据ID删除分类")
    public Result deletById(Integer id) {
        log.info("跟据ID删除分类：{}", id);
        categoryService.deleteById(id);
        return Result.success();
    }

    @GetMapping("/list")
    @ApiOperation("根据类型查询分类")
    public Result<List<Category>> selectByType(Integer type){
        List<Category> list = categoryService.selectByType(type);
        return Result.success(list);
    }
}
