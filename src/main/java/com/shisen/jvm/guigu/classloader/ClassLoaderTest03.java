package com.shisen.jvm.guigu.classloader;

/**
 * <pre>
 * Description  双亲委派
 * @author shishi
 * 2020/8/12 13:57
 * </pre>
 */
public class ClassLoaderTest03 {

    public static void main(String[] args) {
        String str = new java.lang.String();
        System.out.println("hello");
        String1 string1 = new String1(); // Prohibited package name: java.lang
        System.out.println("hello aging");

    }
}
