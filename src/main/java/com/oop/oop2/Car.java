package com.oop.oop2;

/**
 * @author Dimension
 * @title <面向对象.this.edium>
 * @date 2022/8/415:53
 * @desc
 */
public class Car {
    String name;
    int price;
//    构造器
    public Car(){
        System.out.println("无参构造器中的this指向对象:"+this);
    }
    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
//    run方法
    public void rate(String name,int speed){
        System.out.println(this.name+"正在和"+name+"比赛");
        System.out.println("比赛有些激烈");
        if (this.price<speed){
            System.out.println("胜出者是："+name);
        }else if(this.price>speed){
            System.out.println("胜出者是:"+this.name);
        }
    }
//    方法中的this
    public void rate(){
        System.out.println("方法中的this,指向对象:"+this);
    }
}
