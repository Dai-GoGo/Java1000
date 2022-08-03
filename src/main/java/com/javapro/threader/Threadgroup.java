package com.javapro.threader;
import java.util.Random;
public class Threadgroup {
    //2022年7月1日
    public static void main(String[] args) throws InterruptedException {
        //创建一个线程分组
        ThreadGroup threadGroup=new ThreadGroup("女子组100米");
        //定义任务
        Runnable run=new Runnable() {
            @Override
            public void run() {
                //随机给运动员一个跑步成绩（score）范围为[0，500）
                int score=new Random().nextInt(500);
                try {
                    //线程休眠；score越大，线程休眠时间越长，比赛成绩越靠后
                    Thread.sleep(score);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" "+score);
            }
        };
        //3个运动员都是threadGroup组的，需要完成Runnable类的run任务，并分别给命名为1、2、3
        Thread thread1=new Thread(threadGroup,run,"1");
        Thread thread2=new Thread(threadGroup,run,"2");
        Thread thread3=new Thread(threadGroup,run,"3");
        //开始比赛
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
