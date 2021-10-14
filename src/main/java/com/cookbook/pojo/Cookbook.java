package com.cookbook.pojo;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "cookbook")
public class Cookbook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自動增長主鍵
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer type;

    @Column(nullable = false)
    private String material;

    @Column(nullable = false)
    private String recipe;

    @Column(nullable = false, name = "create_date")
    private LocalDateTime createDate;

    public Cookbook(String name, Integer type, String material, String recipe){
        this.name = name;
        this.type = type;
        this.material = material;
        this.recipe = recipe;
    }

    public Cookbook() {

    }
}
