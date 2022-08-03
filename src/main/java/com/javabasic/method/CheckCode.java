package com.javabasic.method;

import java.util.Random;

/**
 * @author Dimension
 * @title <生成5位数验证码+Random类使用>
 * @date 2022/8/217:24
 * @desc 利用分支语句对于既定的验证码规则进行约束,通过循环语句补全位数
 * nextInt(n)方法默认的是[从0-n)的范围
 */
public class CheckCode {
    public static void main(String[] args) {
        String checkCode = createCode(5);
        System.out.println("您的验证码是:"+checkCode);
    }
    public static String createCode(int n){
//        利用循环生成凑满5位数的字符验证码
        String code ="";
        Random r = new Random();
        for (int i = 1;i<=n;i++){
//            验证码的组成成分一般为数字\小写字母\大写字母三种情况随机拼凑;
            int type = r.nextInt(3);
            switch (type){
                //            故使用一个swtich分支把case表示出来
                case 0:
                    char chr1 = (char)(r.nextInt(26)+65);
//                    小写字符case
                    code += chr1;
//                    将生成的一位字符插入到code
                    break;
                case 1:
                    char chr2 = (char)(r.nextInt(26)+97);
//                    大写字母case
                    code +=chr2;
                    break;
                case 2:
                    int chr3 = r.nextInt(9);
                    code += chr3;
                    break;
            }
        }
        return code;
    }
}
