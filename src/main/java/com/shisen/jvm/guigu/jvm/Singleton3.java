package com.shisen.jvm.guigu.jvm;

/**
 * <pre>
 * Description
 * @author shishi
 * 2020/8/17 15:15
 * </pre>
 */
public class Singleton3 {

    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        return Singleton3Instance.INSTANCE;
    }


    private static class Singleton3Instance {
        private static Singleton3 INSTANCE = new Singleton3();
    }
}
