package com.javabasic.flowcontrol;

/**
 * @author Dimension
 * @title <While案例中阶>
 * @date 2022/7/2817:47
 * @desc  纸张对折多少次才能达到珠穆朗玛峰高度
 */
public class WhileDemo02 {
    //主函数
    public static void main(String[] arges){
        double peakHeight = 8848860;
        double paperHeight = 0.1;
        int count = 0;
        while (paperHeight < peakHeight){
            paperHeight = paperHeight*2;// 简化成*=  对折含义就是heightx2
            count++;
        }
        System.out.println(count+"次");
        System.out.println("paper最终厚度为"+paperHeight);
    }
}
