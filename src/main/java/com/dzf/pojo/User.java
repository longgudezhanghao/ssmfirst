package com.dzf.pojo;

import javax.xml.bind.annotation.XmlRootElement;

//json数据属性位置问题未解决
@XmlRootElement(name = "user")
public class User {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
