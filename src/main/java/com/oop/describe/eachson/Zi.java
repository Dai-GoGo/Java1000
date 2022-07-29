package com.oop.describe.eachson;

import com.oop.describe.Fu;

/**
 * @author Dimension
 * @title <子类测试父类的方法>
 * @date 2022/7/2916:07
 * @desc
 */
public class Zi extends Fu {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.protectedMethod();
        z.publicMethod();
    }

}
