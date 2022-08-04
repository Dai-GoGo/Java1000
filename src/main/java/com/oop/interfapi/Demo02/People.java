package com.oop.interfapi.Demo02;

/**
 * @author Dimension
 * @title <理解继承-初步-人类主类>
 * @date 2022/8/117:55
 * @desc    创建一个人类,让学生继承之后实现更仔细的方法;
 */
public class People {
    private String name;
    private int age;

    /*
     *查看课表方法
     */
    public void querryCourse() {
        System.out.println("正在查看课表ing~~~~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
