package com.shisen.jvm.guigu.runtime;

/**
 * <pre>
 * Description  方法区
 *
 * JDK7及以前
 * -XX:PermSize=100m -XX:MaxPermSize=100m
 *
 * JDK8 及以后
 * -XX:MetaspaceSize=100m -XX:MaxMetaspaceSize=100m
 * @author shishi
 * 2020/9/17 14:35
 * </pre>
 */
public class MethodAreaTest {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
