package com.cookbook.controller;

import com.cookbook.pojo.Cookbook;
import com.cookbook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Controller
public class IndexController {

    Logger logger = Logger.getLogger("IndexController");

    @Autowired
    RecipeService recipeService;

    @RequestMapping(value = "/index")
    public ModelAndView index(ModelAndView modelAndView){
//        modelAndView.addObject("name", "COOKBOOK");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/add")
    public ModelAndView toAddRecipe(ModelAndView modelAndView){
        modelAndView.setViewName("add");
        return modelAndView;
    }

    @PostMapping(value = "/searchRecipe")
    public ModelAndView searchRecipe(String name, String type, ModelAndView modelAndView) {
        List<Cookbook> cookbookList;
        // name不為空
        if (!Objects.equals(name, "") && Objects.equals(type, "")){
            cookbookList = recipeService.findByName(name);
            // type不為空
        } else if (Objects.equals(name, "") && !Objects.equals(type, "")) {
            cookbookList = recipeService.findByType(type);
        } else if (!Objects.equals(name, "") && !Objects.equals(type, "")) {
            cookbookList = recipeService.findByNameLikeAndType(name, type);
        } else {
            cookbookList = recipeService.findAll();
        }

        if (CollectionUtils.isEmpty(cookbookList)){
            logger.info("null");
            modelAndView.addObject("errMsg", "SORRY 找不到相關資料");
            modelAndView.setViewName("search");
            return modelAndView;
        }else {
            logger.info(cookbookList.toString());
            modelAndView.addObject(cookbookList);
            modelAndView.setViewName("search");
            return modelAndView;
        }
    }
}
