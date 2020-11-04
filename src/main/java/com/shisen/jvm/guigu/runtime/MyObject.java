package com.shisen.jvm.guigu.runtime;

/**
 * <pre>
 * Description  对象实例化的过程
 * 1, 类信息的加载, 链接, 初始化
 * 2, 申请内存空间
 * 3, 处理并发问题
 * 4, 属性的默认初始化(零值初始化)
 * 5, 设置对象头信息
 * 6, 属性的显示初始化, 代码块初始化, 构造器初始化
 *
 *
 * 对象属性赋值的操作
 * 1, 属性的默认初始化
 * 2, 显示初始化/代码块初始化
 * 3, 构造器初始化
 *
 * @author shishi
 * 2020/11/4 14:58
 * </pre>
 */
public class MyObject {
    int id = 100;
    String name;
    Account account;

    {
        name = "施森";
    }

    public MyObject() {
        account = new Account();
    }
}

class Account{

}

