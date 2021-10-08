package com.company.TaskB;

public class CourseThread implements Runnable{
    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
