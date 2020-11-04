package com.shisen.jvm.guigu.classloader;

import sun.misc.Launcher;
import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;

/**
 * <pre>
 * Description
 * @author shishi
 * 2020/8/12 13:57
 * </pre>
 */
public class ClassLoaderTest02 {

    public static void main(String[] args) {
        System.out.println("********启动类加载器********");

        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL element : urLs) {
            System.out.println(element.toExternalForm());
        }

        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);

        System.out.println("********扩展类加载器********");

/*        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")) {
            System.out.println(path);
        }*/

        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println("classLoader1 = " + classLoader1);

    }
}
