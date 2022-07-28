package com.javabasic.flowcontrol;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Dimension
 * @title <集合+增强型for循环>
 * @date 2022/7/2817:45
 * @desc
 */
public class ForCollPlus {
    public static void main(String[] args){
        Collection cell = new ArrayList();
        cell.add(122);
        cell.add(345);
        cell.add(new String("Tom"));
        cell.add(false);
        for(Object element:cell){
            System.out.println(element);
        }
    }
}
