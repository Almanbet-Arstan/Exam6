package com.company.TaskB;

public class Main {
    public static void main(String[] args) {
        Thread java = new Thread(new CourseThread());
        Thread javaScript = new Thread(new CourseThread());
        Thread cSharp = new Thread(new CourseThread());
        Thread go = new Thread(new CourseThread());
        Thread python = new Thread(new CourseThread());
        Thread php = new Thread(new CourseThread());
        java.setName("Java");
        javaScript.setName("JavaScript");
        cSharp.setName("C#");
        go.setName("Go");
        python.setName("Python");
        php.setName("PHP");

        try {
            java.start();
            java.join();

            python.start();
            python.join();

            go.start();
            go.join();

            javaScript.start();
            javaScript.join();

            php.start();
            php.join();

            cSharp.start();
            cSharp.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
