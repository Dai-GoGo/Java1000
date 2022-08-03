package com.javabasic.method;

/**
 * @author Dimension
 * @title <方法重载案例>
 * @date 2022/8/316:42
 * @desc
 */
public class ReloadDemo01 {
    public static void main(String[] args) {
        fire();
        fire("康斯坦丁");
        fire(100,"凯普乐星球");
    }
    public static void fire(){
//        新方法
        System.out.println("发射了一枚神风导弹~~~");
    }
    public static void fire(String location){
//        重载的方法2
        fire(100,"康斯坦丁");//System.out.println("发射了一枚神风导弹,目标:"+location);
    }
    public static void fire(int length,String location){
//        重载的方法3
        System.out.println("发射了一枚神风导弹,目标:"+location+"距离:"+length);
    }
}
