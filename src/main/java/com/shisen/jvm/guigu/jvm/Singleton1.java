package com.shisen.jvm.guigu.jvm;

/**
 * <pre>
 * Description
 * @author shishi
 * 2020/8/17 15:08
 * </pre>
 */
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1(){

    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
