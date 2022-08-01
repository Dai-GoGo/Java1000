package com.oop.interfapi.DemoG1;

/**
 * @author Dimension
 * @title <name>
 * @date 2022/8/118:31
 * @desc
 */
public class Tyke implements OnEarth, Attack.NearAttack {

    public String name;
    @Override
    public void nearAttack() {
        System.out.println(name+"可以近战攻击");
    }

    @Override
    public void moveonEarth() {
        System.out.println(name+"在地面上移动");
    }

    public Tyke(String name) {
        this.name = name;
    }
}
