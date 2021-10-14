package com.cookbook.service;

import com.cookbook.pojo.Cookbook;

import java.util.List;

public interface RecipeService {

    void addRecipe(String name, String type, String material, String recipe);

    List<Cookbook> findByName(String name);
}
