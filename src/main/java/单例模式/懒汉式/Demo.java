package 单例模式.懒汉式;

/**
 * 特点：线程安全，并发性能低，能延时加载
 * 代码：（每次都访问都要调用加了锁定的 getInstance()，并发效率低，不过资源的利用率会比较高）
 */
public class Demo {

    private Demo() {
    }

    private static Demo demo;

    public synchronized static Demo getInstance() {
        if (null == demo) {
            demo = new Demo();
        }
        return demo;
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

    private static Demo demo;

    public synchronized static Demo getDemo() {
        if (null == demo) {
            demo = new Demo();
        }
        return demo;
    }


 */