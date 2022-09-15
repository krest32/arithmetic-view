package 单例模式.饿汉式;


/**
 * 天然线程安全，但是不支持懒加载
 */
public class Demo {

    private Demo() {
    }

    private static Demo demo = new Demo();

    public static Demo getInstance() {
        return demo;
    }

    public static void main(String[] args) {
        Demo instance = getInstance();
        Demo instance1 = getInstance();

        System.out.println(instance);
        System.out.println(instance1);
    }

    /*
        private Demo() {
        }

        private static Demo demo = new Demo();

        public static Demo getInstance() {
            return demo;
        }
     */
}
