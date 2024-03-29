package com.itheima.api.controller;

import com.itheima.api.pojo.Category;
import com.itheima.api.pojo.Result;
import com.itheima.api.service.CategoryService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.NotEmpty;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    @PostMapping
    public Result category(@RequestBody @Validated(Category.Add.class) Category category) {
        return categoryService.add(category);
    }

    @GetMapping
    public Result list() {
        return categoryService.list();
    }

    @GetMapping("/detail")
    public Result<Category> detail(@NotEmpty String id) {
        return categoryService.detail(id);
    }

    @PutMapping
    public Result update(@RequestBody @Validated(Category.Update.class) Category category) {
        return categoryService.update(category);
    }
}
