package com.cookbook.service.impl;

import com.cookbook.pojo.Cookbook;
import com.cookbook.repository.CookbookRepository;
import com.cookbook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.logging.Logger;

@Service
public class RecipeServiceImpl implements RecipeService {

    Logger logger = Logger.getLogger("RecipeService");

    @Autowired
    CookbookRepository cookbookRepository;

    @Override
    public void addRecipe(String name, Integer type, String material, String recipe) {
        Cookbook cookbook = cookbookRepository.findByName(name);
        if (Objects.nonNull(cookbook)){
            logger.info("Add Failed : already exists");
        } else {
            Cookbook cookbook1 = new Cookbook(name, type, material, recipe);
            cookbook1.setCreateDate(LocalDateTime.now());
            cookbookRepository.saveAndFlush(cookbook1);
            logger.info("Add Succeed");
        }
    }

    @Override
    public Cookbook findByName(String name) {
        Cookbook cookbook = cookbookRepository.findByName(name);
        if (Objects.nonNull(name)) {
            return cookbook;
        } else {
            return null;
        }
    }
}
