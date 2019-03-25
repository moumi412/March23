package com.mycompany.app;

/**
 * Hello world! This is modified by Lakshmi
 */
public class App
{

    private final String message = "Hello World! is the msg from class from child";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
