package com.shisen.jvm.guigu.runtime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Objects;

/**
 * <pre>
 * Description
 * @author shishi
 * 2020/11/4 16:46
 * </pre>
 */
public class BufferTest1 {
    private static final String FILE = "E:\\hevPV.mp4";
    private static final int _100Mb = 1024 * 1024 * 100;

    public static void main(String[] args) {
        long sum = 0;
        for (int i = 0; i < 3; i++) {
            String dest = "E:\\hevPV+" + i + ".mp4";
            sum += io(FILE, dest); // 2_348_338_700
//            sum += directBuffer(FILE, dest); // 1_501_118_999
        }
        System.out.println("sum = " + sum);
    }

    private static long directBuffer(String file, String dest) {
        long start = System.nanoTime();
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            inChannel = new FileInputStream(file).getChannel();
            outChannel = new FileOutputStream(dest).getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_100Mb);

            if (-1 != inChannel.read(byteBuffer)) {
                byteBuffer.flip(); // 修改数据为读数据模式
                outChannel.write(byteBuffer);
                byteBuffer.clear(); // 清空
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(outChannel)) {
                try {
                    outChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (Objects.nonNull(inChannel)) {
                try {
                    inChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long end = System.nanoTime();
        return end - start;
    }

    private static long io(String file, String dest) {
        long start = System.nanoTime();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {

            fis = new FileInputStream(file);
            fos = new FileOutputStream(dest);
            byte[] buffer = new byte[_100Mb];
            int len = -1;

            while (-1 != (len = fis.read(buffer))) {
                fos.write(buffer, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(fos)) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (Objects.nonNull(fis)) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        long end = System.nanoTime();

        return end - start;
    }
}
