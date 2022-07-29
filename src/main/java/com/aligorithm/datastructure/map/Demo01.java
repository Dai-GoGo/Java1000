package com.aligorithm.datastructure.map;

import java.util.HashMap;

/**
 * @author Dimension
 * @title <简单的创建一个HashMap+插入数据>
 * @date 2022/7/2916:38
 * @desc
 */
public class Demo01 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("刘德华",20);
        hm.put("林志炫",22);
        hm.put("郭富城",21);
        hm.put("张雪哟",40);
        hm.put("杨幂",31);
        System.out.println(hm);
    }
}
