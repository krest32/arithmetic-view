package 单例模式.静态内部类式;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * ​ 代码加载时，不会直接加载静态内部类，只有当调用代码时候，才会加载静态内部类（线程安全），这个时候，直接就可以获取对象
 */
public class Demo {

    private Demo() {
    }

    private static class SingleClassInstance {
        private static final Demo demo = new Demo();
    }

    public static Demo getInstance() {
        return SingleClassInstance.demo;
    }

    public static void main(String[] args) {
        Demo instance = getInstance();
        Demo instance1 = getInstance();

        System.out.println(instance);
        System.out.println(instance1);
    }

}

/*
    private Demo() {
    }

    private static class SingleClassInstance {
        private static final Demo demo = new Demo();
    }

    public Demo getInstance() {
        return SingleClassInstance.demo;
    }
 */