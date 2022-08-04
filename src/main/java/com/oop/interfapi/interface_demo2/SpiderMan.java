package com.oop.interfapi.interface_demo2;

/**
 * @author Dimension
 * @title <name>
 * @date 2022/8/411:40
 * @desc
 */
public class SpiderMan implements Law,SpuerMan{
    public String name;
    public SpiderMan(String name){
        this.name = name;
    }
    @Override
    public void rule() {
        System.out.println("英雄也需要遵纪守法");
    }

    @Override
    public void run() {
        System.out.println(name+"跑的快如闪电");
    }

    @Override
    public void fly() {
        System.out.println(name+"能够飞翔");
    }
}
