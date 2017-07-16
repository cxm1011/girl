package com.imooc.girl.model.entity;

import javax.validation.constraints.Min;

/**
 * Created by chen on 2017/7/16.
 */
public class GirlEntity {
    private int id;
    @Min(value = 18,message = "年龄不能低于18")
    private int age;
    private String name;
    private double height;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
