package com.cookbook.service.impl;

import com.cookbook.pojo.Cookbook;
import com.cookbook.repository.CookbookRepository;
import com.cookbook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Service
public class RecipeServiceImpl implements RecipeService {

    Logger logger = Logger.getLogger("RecipeService");

    @Autowired
    CookbookRepository cookbookRepository;

    @Override
    public void addRecipe(String name, String type, String material, String recipe) {
        List<Cookbook> cookbookList = cookbookRepository.findByNameLike(name);
        if (CollectionUtils.isEmpty(cookbookList)){
            cookbookList.forEach(cookbook -> {
                cookbook = new Cookbook(name, type, material, recipe);
                cookbook.setCreateDate(LocalDateTime.now());
                cookbookRepository.saveAndFlush(cookbook);
                logger.info("Add Succeed");
            });
        } else {
            logger.info("Add Failed : already exists");
        }
    }

    @Override
    public List<Cookbook> findByName(String name) {
        List<Cookbook> cookbookList = cookbookRepository.findByNameLike("%" + name + "%");
        if (CollectionUtils.isEmpty(cookbookList)) {
            return null;
        } else {
            return cookbookList;
        }
    }
}
