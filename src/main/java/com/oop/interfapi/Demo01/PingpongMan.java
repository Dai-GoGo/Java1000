package com.oop.interfapi.Demo01;

/**
 * @author Dimension
 * @title <实现了运动员接口的pingpongman>
 * @date 2022/8/116:14
 * @desc
 */
public class PingpongMan implements SportMan {
    private String name;
    public PingpongMan(String name){
        this.name  = name;
    }

    @Override
    public void run() {
        System.out.println("乒乓球员跑得很快");
    }

    @Override
    public void competition() {
        System.out.println(name+"需要比赛乒乓球");
    }

}
