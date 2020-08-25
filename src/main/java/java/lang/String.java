package java.lang;

/**
 * <pre>
 * Description
 * @author shishi
 * 2020/8/12 15:52
 * </pre>
 */
public class String {
    static {
        System.out.println("自定义String类的静态代码块");
    }

    public static void main(String[] args) {
        // 在类 java.lang.String 中找不到 main 方法
        System.out.println("hello String");
    }
}
