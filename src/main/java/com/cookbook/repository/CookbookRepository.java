package com.cookbook.repository;

import com.cookbook.pojo.Cookbook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CookbookRepository extends JpaRepository<Cookbook, Integer> {

    Cookbook findByName(String name);

    List<Cookbook> findByType(Integer type);

    List<Cookbook> findByMaterial(String material);
}
