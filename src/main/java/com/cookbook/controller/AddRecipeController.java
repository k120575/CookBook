package com.cookbook.controller;

import com.cookbook.service.RecipeService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddRecipeController {

    private Log log = LogFactory.getLog(AddRecipeController.class);

    @Autowired
    RecipeService recipeService;

    @PostMapping(value = "/addRecipe")
    public void addRecipe(@RequestParam("name") String name,
                          @RequestParam("type") String type,
                          @RequestParam("material") String material,
                          @RequestParam("recipe") String recipe,
                          HttpServletRequest request,
                          HttpServletResponse response){
        try {
            recipeService.addRecipe(name, type, material, recipe);
            response.sendRedirect(request.getContextPath() + "/index");
        }catch (Exception e){
            log.info(e.toString());
        }
    }
}
