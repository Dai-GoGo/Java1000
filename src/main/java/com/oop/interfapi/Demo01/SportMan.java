package com.oop.interfapi.Demo01;

/**
 * @author Dimension
 * @title <接口&继承-初学>
 * @date 2022/8/116:14
 * @desc 定义一歌SportMan接口，里面包含运动员的基本方法，
 * 再定义一个乒乓球运动员的方法继承运动员接口，实现运动员的基本方法（素质）
 */
public interface SportMan {
    //运动员接口  (也就是运动员规范)
    public void run();
    public void competition();
}
