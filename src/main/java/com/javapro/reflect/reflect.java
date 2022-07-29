package com.javapro.reflect;

/**
 * @author Dimension
 * @title <反射之获取class对象>
 * @date 2022/7/2919:24
 * @desc
 * 1.反射的第一步——获取Class类对象，这样才可以获取类的全部属性
 *
 *
 */
public class reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        /**方式一.Class.Forname方法
         *
         * */
        Class c = Class.forName("com.javapro.reflect.Student");
        System.out.println(c);

        //方法二.直接使用类名.class访问
        Class c1 = Student.class;
        System.out.println(c1);

        //方法三.创建一个对象，通过getClass()方法获取对象的对应的类的书属性
        Student s1 = new Student();
        Class c2 = s1.getClass();
        System.out.println(c2);
    }
}
