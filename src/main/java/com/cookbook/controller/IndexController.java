package com.cookbook.controller;

import com.cookbook.pojo.Cookbook;
import com.cookbook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView searchRecipe(@RequestParam("name") String name, ModelAndView modelAndView) {
        Cookbook cookbook = recipeService.findByName(name);
        logger.info(cookbook.toString());
        if (Objects.nonNull(cookbook)){
            modelAndView.addObject(cookbook);
            modelAndView.setViewName("search");
            return modelAndView;
        }else {
            modelAndView.setViewName("search");
            return modelAndView;
        }
    }
}
