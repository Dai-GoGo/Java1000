package com.oop.oop2;

/**
 * @author Dimension
 * @title <静态方法测试>
 * @date 2022/8/416:25
 * @desc
 */
public class StaticDemo01 {
    public static void main(String[] args) {
        System.out.println("----Main Method Begin!----🐢LatterThanStatic...-------");
    }
//    静态代码块
    /*此处证明代码的先后顺序并没有影响static代码块优先加载，因为static代码块是随着类创建而加载*/
    static{
    System.out.println("----Static Code Are Starting!-----");
    }
}
