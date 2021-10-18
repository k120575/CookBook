package com.cookbook.service;

import com.cookbook.pojo.Cookbook;

import java.util.List;

public interface RecipeService {

    void addRecipe(String name, String type, String material, String recipe);

    List<Cookbook> findByNameLike(String name);

    List<Cookbook> findByType(String type);

    List<Cookbook> findByNameLikeAndType(String name, String type);

    List<Cookbook> findAll();

    List<Cookbook> findByMaterialLike(String material);

    List<Cookbook> findByNameLikeAndMaterialLike(String name, String material);

    List<Cookbook> findByMaterialLikeAndType(String material, String type);

    List<Cookbook> findByNameLikeAndMaterialLikeAndType(String name, String material, String type);
}
