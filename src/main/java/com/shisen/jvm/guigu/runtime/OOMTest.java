package com.shisen.jvm.guigu.runtime;

import java.util.ArrayList;
import java.util.Random;

/**
 * <pre>
 * Description
 * @author shishi
 * 2020/8/25 16:40
 * </pre>
 */
public class OOMTest {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(1024 * 1024)));
        }
    }


}

class Picture{
    private byte[] pixels;

    public Picture(int length){
        this.pixels = new byte[length];
    }
}
