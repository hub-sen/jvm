package com.shisen.jvm.guigu.classloader;

import java.io.FileNotFoundException;
import java.util.Objects;

/**
 * <pre>
 * Description
 * @author shishi
 * 2020/8/12 15:37
 * </pre>
 */
public class CustomClassloader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] result = getClassFromCustomPath(name);

        try {
            if (Objects.isNull(result)) {
                throw new FileNotFoundException();
            } else {
                return defineClass(name, result, 0, result.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        throw new ClassNotFoundException();
    }

    private byte[] getClassFromCustomPath(String name) {
        return null;
    }

    public static void main(String[] args) {
        CustomClassloader customClassloader = new CustomClassloader();

        try {
            Class<?> one = Class.forName("one", true, customClassloader);
            Object obj = one.newInstance();
            System.out.println("obj.getClass().getClassLoader() = " + obj.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
