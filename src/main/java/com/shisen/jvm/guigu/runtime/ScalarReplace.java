package com.shisen.jvm.guigu.runtime;

/**
 * <pre>
 * Description  逃逸分析 - 标量替换
 * -Xmx100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-EliminateAllocations
 * @author shishi
 * 2020/9/17 11:37
 * </pre>
 */
public class ScalarReplace {

    public static class User {
        public int id;
        public String name;
    }

    public static void alloc() {
        User user = new User();
        user.id = 5;
        user.name = "施森";
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("(end - start) = " + (end - start) + "ms");
    }

}
