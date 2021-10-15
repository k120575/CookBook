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
    public ModelAndView searchRecipe(@RequestParam("name") String name, ModelAndView modelAndView) {
        List<Cookbook> cookbookList = recipeService.findByName(name);
        if (CollectionUtils.isEmpty(cookbookList)){
            logger.info("null");
            modelAndView.addObject("errMsg", "SORRY null");
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
