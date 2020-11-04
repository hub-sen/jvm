package com.shisen.jvm.guigu.runtime;

/**
 * <pre>
 * Description  逃逸分析 - 栈上分配
 * -Xms1G -Xmx1G -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 * @author shishi
 * 2020/9/16 18:16
 * </pre>
 */
public class StackAllocation {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("(end - start) = " + (end - start) +"ms");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }



    private static void alloc() {
        User user = new User();
    }

    static class User {

    }
}
