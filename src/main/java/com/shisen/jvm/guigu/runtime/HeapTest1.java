package com.shisen.jvm.guigu.runtime;

/**
 * <pre>
 * Description
 * @author shishi
 * 2020/8/19 15:03
 * </pre>
 */
public class HeapTest1 {
    public static void main(String[] args) {
        System.out.println("start ...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end ...");
    }
}
