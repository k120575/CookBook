package com.cookbook.repository;

import com.cookbook.pojo.Cookbook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CookbookRepository extends JpaRepository<Cookbook, Integer> {

    List<Cookbook> findByNameLike(String name);

    List<Cookbook> findByType(String type);

    List<Cookbook> findByNameLikeAndType(String name, String type);

    List<Cookbook> findByMaterialLike(String material);

    List<Cookbook> findByNameLikeAndMaterialLike(String name, String material);

    List<Cookbook> findByMaterialLikeAndType(String material, String type);

    List<Cookbook> findByNameLikeAndMaterialLikeAndType(String name, String material, String type);
}
