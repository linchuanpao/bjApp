package com.bj.dao.login;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    public static ThreadPoolExecutor poolExecutor;
    static {
        poolExecutor = new ThreadPoolExecutor(6,7,60 * 10, TimeUnit.SECONDS, new ArrayBlockingQueue(10), new ThreadPoolExecutor.AbortPolicy());

    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            poolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("我的线程编码是" + Thread.currentThread().getId());
                }
            });
        }

    }

    
}
