package com.shisen.jvm.guigu.runtime;

/**
 * <pre>
 * Description
 * @author shishi
 * 2020/11/3 16:27
 * </pre>
 */
public class MethodAreaTest2 {
    public static void main(String[] args) {
        Order order = null;
        order.hello();
        System.out.println("order.count = " + order.count);
    }
}

class Order{
    public static int count = 1;
    public static final int number = 2;

    public static void hello(){
        System.out.println("hello");
    }
}
