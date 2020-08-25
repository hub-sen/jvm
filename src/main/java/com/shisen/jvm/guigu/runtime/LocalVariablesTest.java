package com.shisen.jvm.guigu.runtime;

/**
 * <pre>
 * Description
 * @author shishi
 * 2020/8/13 15:52
 * </pre>
 */
public class LocalVariablesTest {


    public LocalVariablesTest() {
    }

    public static void main(String[] args) {
        LocalVariablesTest localVariablesTest = new LocalVariablesTest();
        String str = "1";
        int x = 1;
    }

    public void test() {
        int i = 0;
        {
            double j = 1;
            j = 1 + 1;
        }
        int k = 2;
        int z = 1;
    }
}

class LocalVariablesTest2 extends LocalVariablesTest {
    public LocalVariablesTest2() {
        super.test();
    }
}
