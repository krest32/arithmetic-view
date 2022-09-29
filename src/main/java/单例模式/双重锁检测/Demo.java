package 单例模式.双重锁检测;

/**
 * 在懒汉式的基础上优化了效率，同时支持掩饰加载
 * 需要使用volatile修饰对象，避免多线程的指令重排造成的异常
 */
public class Demo {

    private Demo() {
    }

    private volatile static Demo demo;

    public static Demo getInstance() {
        if (null == demo) {
            synchronized (Demo.class) {
                if (null == demo) {
                    demo = new Demo();
                }
            }
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

    private volatile static Demo demo;

    public static Demo getInstance() {
        if (null == demo) {
            synchronized (Demo.class) {
                if (null == demo) {
                    demo = new Demo();
                }
            }
        }
        return demo;
    }
 */
