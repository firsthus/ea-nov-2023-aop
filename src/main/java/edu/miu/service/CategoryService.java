package edu.miu.service;

import org.springframework.stereotype.Service;

@Service
public class CategoryService {


    public String createCategory() {
        return "Category created";
    }



    public String getCategory() {
        return "Category retrieved";
    }



    public String deleteCategory() {
        return "Category deleted";
    }
}
