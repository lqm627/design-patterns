package qm.design.patterns.singleton;

public class SingletonEHS {
    /**
     * 私有默认构造子
     */
    private static SingletonEHS instance = new SingletonEHS();

    private SingletonEHS() {
    }

    /**
     * 静态工厂方法
     */
    public static SingletonEHS getInstance() {
        return instance;
    }
}
