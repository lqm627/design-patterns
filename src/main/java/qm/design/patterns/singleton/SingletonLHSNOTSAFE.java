package qm.design.patterns.singleton;

public class SingletonLHSNOTSAFE {
    private static SingletonLHSNOTSAFE instance;

    /**
     * 私有默认构造子
     */
    private SingletonLHSNOTSAFE() {
    }

    /**
     * 静态工厂方法
     */
    public static SingletonLHSNOTSAFE getInstance() {
        if (instance == null) {
            instance = new SingletonLHSNOTSAFE();
        }
        return instance;
    }
}
