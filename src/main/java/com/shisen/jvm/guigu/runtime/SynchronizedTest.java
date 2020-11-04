package com.shisen.jvm.guigu.runtime;

/**
 * <pre>
 * Description  逃逸分析 - 同步省略
 * @author shishi
 * 2020/9/17 11:19
 * </pre>
 */
public class SynchronizedTest {

    public void f(){
        Object o = new Object();
        synchronized (o) {
            System.out.println("o = " + o);
        }
    }

}
