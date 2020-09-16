package com.shisen.jvm.guigu.runtime;

import java.util.ArrayList;
import java.util.Random;

/**
 * <pre>
 * Description  -Xms600m -Xmx600m
 * @author shishi
 * 2020/8/26 10:30
 * </pre>
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024 * 1024)];

    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<>();
        while (true) {
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
