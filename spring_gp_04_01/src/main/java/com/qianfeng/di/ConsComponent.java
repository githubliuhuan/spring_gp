package com.qianfeng.di;

/**
 * Created by liuhuan on 2020/3/7 15:52
 */
public class ConsComponent {
    private Integer id;
    private String name;
    private Boolean gender;

    public ConsComponent() {
        super();
    }

    public ConsComponent(Integer id) {
        System.out.println("构造0");
        this.id = id;
    }

    public ConsComponent(Integer id, String name, Boolean gender) {
        System.out.println("构造1");
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public ConsComponent(Integer id, String name) {
        System.out.println("构造2");
        this.id = id;
        this.name = name;
    }

    public ConsComponent(Boolean gender, Integer id, String name) {
        System.out.println("构造3");
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}
