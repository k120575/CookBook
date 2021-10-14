package com.cookbook.controller;

import com.cookbook.pojo.Cookbook;
import com.cookbook.repository.CookbookRepository;
import com.cookbook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@Controller
public class SearchRecipeController {

    @Autowired
    CookbookRepository cookbookRepository;

    @Autowired
    RecipeService recipeService;

//    @RequestMapping(value = "/searchRecipe")
//    public ModelAndView searchRecipe(@RequestParam("name") String name,
//                                     HttpServletRequest request,
//                                     HttpServletResponse response) throws IOException {
//        Cookbook cookbook = recipeService.findByName(name);
//        if (Objects.nonNull(cookbook)){
//            ModelAndView modelAndView = new ModelAndView();
//            modelAndView.addObject(cookbook);
//            return modelAndView;
//        }else {
//            response.sendRedirect(request.getContextPath() + "/index");
//        }
//        return null;
//    }
}
