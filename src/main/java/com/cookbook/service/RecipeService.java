package com.cookbook.service;

import com.cookbook.pojo.Cookbook;

public interface RecipeService {

    void addRecipe(String name, Integer type, String material, String recipe);

    Cookbook findByName(String name);
}
