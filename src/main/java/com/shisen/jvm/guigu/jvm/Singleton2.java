package com.shisen.jvm.guigu.jvm;

import java.util.Objects;

/**
 * <pre>
 * Description
 * @author shishi
 * 2020/8/17 15:10
 * </pre>
 */
public class Singleton2 {

    private static volatile Singleton2 instance = null;

    private Singleton2(){

    }

    public static Singleton2 getInstance() {

        if (Objects.isNull(instance)) {
            synchronized (Singleton2.class){
                if (Objects.isNull(instance)) {
                    instance = new Singleton2();
                }
            }
        }


        return instance;
    }



}
