package com.oop.oop2;

/**
 * @author Dimension
 * @title <深入理解面向对象.测试类>
 * @date 2022/8/415:59
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.rate();
        System.out.println(c);//由此可知this和c（构造的对象）地址一致

        System.out.println("-----------");
        Car c2 = new Car("Benz",300);
        System.out.println("我的名字是:"+c2.name+"我的价格是"+c2.price);
        c2.rate("宝马",1000);
    }
}
