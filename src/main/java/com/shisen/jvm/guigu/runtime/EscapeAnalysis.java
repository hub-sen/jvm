package com.shisen.jvm.guigu.runtime;

/**
 * <pre>
 * Description  逃逸分析
 *  new的对象实体是否在方在外对调用
 * @author shishi
 * 2020/9/16 18:07
 * </pre>
 */
public class EscapeAnalysis {
    public EscapeAnalysis obj;

    /**
     * 方法返回 EscapeAnalysis 对象, 发生逃逸
     * @return
     */
    public EscapeAnalysis getObj() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    /**
     * 为成员属性赋值, 发生逃逸
     */
    public void setObj() {
        this.obj = new EscapeAnalysis();
    }

    /**
     * 对象的作用域仅在当前方法中有效, 没有发生逃逸
     */
    public void useEscapeAnalysis() {
        EscapeAnalysis s = new EscapeAnalysis();
    }

    /**
     * 引用成员变量的值, 发生逃逸
     */
    public void useEscapeAnalysis1(){
        EscapeAnalysis s = getObj();
        // getObj().xxx // 发生逃逸
    }
}
