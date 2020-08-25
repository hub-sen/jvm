package com.shisen.jvm.guigu.runtime;

/**
 * <pre>
 * Description
 * @author shishi
 * 2020/8/13 17:10
 * </pre>
 */
public class OperandStackTest {


    public static void main(String[] args) {
        OperandStackTest operandStackTest = new OperandStackTest();
        operandStackTest.add();
    }

    public void testAddOperation() {
        byte i = 15;
        int j = 8;
        int k = i + j;
    }


    public void add() {
        // 第一类
        int i1 = 10;
        i1++;
        int i2 = 10;
        ++i2;

        //第二类
        int i3 = 10;
        int i4 = i3++;

        int i5 = 10;
        int i6 = ++i5;

        //第三类

        int i7 = 10;
        i7 = i7++;
        int i8 = 10;
        i8 = ++i8;

        // 第四类
        int i9 = 10;
        int i10 = i9++ + ++i9;

    }
}
