package edu.miu.service;

import edu.miu.aspect.ExecutionTime;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {


    private final CategoryService categoryService;


    @PostMapping
    public String createCategory() {
        return categoryService.createCategory();
    }



    @ExecutionTime
    @GetMapping
    public String getCategory() {
        return categoryService.getCategory();
    }



    @ExecutionTime
    @DeleteMapping
    public String deleteCategory() {
        return categoryService.deleteCategory();
    }
}
