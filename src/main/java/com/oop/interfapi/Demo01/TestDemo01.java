package com.oop.interfapi.Demo01;

/**
 * @author Dimension
 * @title <PingPongman类测试类>
 * @date 2022/8/116:49
 * @desc
 */
public class TestDemo01 {
    //测试类
    public static void main(String[] args) {
        PingpongMan zjk = new PingpongMan("张继科");
        //构造一个PingPongMan对象zjk
        zjk.run();
//        使用pingpongMan的方法
        zjk.competition();
    }
}
