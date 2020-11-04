package com.shisen.jvm.guigu.runtime;

import org.springframework.asm.ClassWriter;
import org.springframework.asm.Opcodes;

/**
 * <pre>
 * Description
 * -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m
 * @author shishi
 * 2020/9/17 18:06
 * </pre>
 */
public class OOMTest2 extends ClassLoader {
    public static void main(String[] args) {
        int j = 0;
        try {
            OOMTest2 oomTest2 = new OOMTest2();
            for (int i = 0; i < 10000; i++) {
                // 创建classWriter 对象, 用于生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);
                // 指明版本号, 修饰符, 类名, 包名, 父类, 接口
                classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                // 返回 byte[]
                byte[] bytes = classWriter.toByteArray();
                // 类加载
                oomTest2.defineClass("Class" + i, bytes, 0, bytes.length);
                j++;
            }
        } finally {
            System.out.println(j);
        }
    }
}
