package com.qjfcc.demo001;

/**
 * @author 秦江峰
 * @AddTime 2019/12/17 16:06
 */
public class DeadLockTest extends  Thread {

    private static String obj0 = "1";
    private static String obj1 = "1";
    private static Integer i = 0;

    public static void main(String[] argss) throws InterruptedException {
        Thread t0 = new DeadLockTest();

        Thread t1 = new DeadLockTest();

        System.out.println("i=" + i);
        t0.start();
        Thread.sleep(300);
        System.out.println("i=" + i);
        t1.start();

    }

    public void run() {
        if (i % 2 == 0) {
            i++;
            synchronized (obj0) {
                try {
                    System.out.println(Thread.currentThread().getId() + "获取锁0");
                    Thread.sleep(3000);
                    synchronized (obj1) {
                        System.out.println(Thread.currentThread().getId() + "获取锁1");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (i % 2 == 1) {
            synchronized (obj1) {
                System.out.println(Thread.currentThread().getId() + "获取锁1 = 1");
                synchronized (obj0) {
                    System.out.println(Thread.currentThread().getId() + "获取锁0 =1");
                }

            }
        }

    }

}
