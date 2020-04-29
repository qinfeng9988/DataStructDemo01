package com.qjfcc.demo001.rate;


import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author 秦江峰
 * @AddTime 2020/4/22 19:19
 */
public class Bucket1 {

    private Object object = new Object();

    private int rate;
    private int token;
    private int max;

    private Date lastUpdate;
    private long secondsWindow;

    private TimeUnit timeUnit;

    public Bucket1(int rate, int max, int secondsWindow,TimeUnit timeUnit) {
        this.rate = this.token = rate;
        this.max = max;
        this.lastUpdate = Calendar.getInstance().getTime();

        this.secondsWindow =  timeUnit.toSeconds(secondsWindow);
    }

    private void add() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(lastUpdate);
        calendar.add(Calendar.SECOND, Integer.valueOf((int)secondsWindow));
        Date now = Calendar.getInstance().getTime();
        if (calendar.getTime().before(now)) {
            this.lastUpdate = now;
            this.token = Math.min(max, this.token + this.rate);
            System.out.println("producer");
        } else System.out.println("buket is full");
    }


    private synchronized int get(int num) {
        this.add();
        if (token - num >= 0) {
            System.out.println("consumer ok[" + num + "]");
            token = token - num;
            return 1;
        }
        System.out.println("consumer fail");
        return 0;
    }

    public static void main(String[] args) {
        Bucket1 bucket1 = new Bucket1(10, 20, 5,TimeUnit.SECONDS);
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Random random = new Random();
                    bucket1.get(random.nextInt(4) + 1);
                }
            }).start();
        }
    }

}
