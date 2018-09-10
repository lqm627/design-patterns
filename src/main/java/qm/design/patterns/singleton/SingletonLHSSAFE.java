package qm.design.patterns.singleton;

public class SingletonLHSSAFE {
    private static SingletonLHSSAFE instance;

    private SingletonLHSSAFE() {
    }

    public static synchronized SingletonLHSSAFE getInstance() {
        if (instance == null) {
            instance = new SingletonLHSSAFE();
        }
        return instance;
    }
}
