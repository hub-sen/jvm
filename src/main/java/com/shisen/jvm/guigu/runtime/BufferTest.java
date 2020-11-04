package com.shisen.jvm.guigu.runtime;

import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * <pre>
 * Description  直接内存
 * @author shishi
 * 2020/11/4 16:35
 * </pre>
 */
public class BufferTest {
    private static final int BUFFER = 1024 * 1024 * 1024; // 1GB

    public static void main(String[] args) {
        // 直接分配本地的内存空间
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);
        System.out.println("直接内存分配完毕, 请求指示");

        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println("开始释放直接内存");
        byteBuffer = null;
        System.gc();
        scanner.next();
    }
}
