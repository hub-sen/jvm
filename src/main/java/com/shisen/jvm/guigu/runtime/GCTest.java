package com.shisen.jvm.guigu.runtime;

import java.util.ArrayList;

/**
 * <pre>
 * Description
 * @author shishi
 * 2020/8/26 10:57
 * </pre>
 */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        try {

            ArrayList<String> list = new ArrayList<>();
            String a = "atguigu.com";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("遍历次数: " + i);
        }
    }
}
