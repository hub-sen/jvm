package com.shisen.jvm.guigu.runtime;

/**
 * <pre>
 * Description
 *
 * 1. 设置堆空间大小的参数
 *      -Xms 设置堆空间(年轻代 + 老年代)的初始内存大小
 *          -X 是jvm的运行参数
 *          ms 是memory start
 *      -Xmx 设置堆空间(年轻代 + 老年代)的最大内存大小
 *
 * 2. 默认堆空间大小
 *      初始内存大小: 物理内存大小的 1/64
 *      最大内存大小: 物理内存大小的 1/4
 *
 * 3. 手动设置: -Xms:600m -Xmx600m
 *      开发中建议将初始内存和最大的堆内存设置成相同的值
 *
 * 4. 查询设置的参数
 *      方式一: jps    /   jstat -gc 进程id
 *      方式二: -XX:+PrintGCDetails
 *
 *
 * @author shishi
 * 2020/8/19 16:38
 * </pre>
 */
public class HeapSpaceInitial {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long initialMemory = runtime.totalMemory() / 1024 / 1024;
        long maxMemory = runtime.maxMemory() / 1024 / 1024;

        System.out.println("-Xms :" + initialMemory + " M");
        System.out.println("-Xmx :" + maxMemory + " M");

/*
        double initialTotalMemory = initialMemory * 64.0 / 1024;
        double maxTotalMemory = maxMemory * 4.0 / 1024;

        System.out.println("totalMemory :" + initialTotalMemory + " G");
        System.out.println("totalMemory :" + maxTotalMemory + " G");
*/

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
