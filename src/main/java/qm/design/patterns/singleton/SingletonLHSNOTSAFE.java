package qm.design.patterns.singleton;

public class SingletonLHSNOTSAFE {
    private static SingletonLHSNOTSAFE instance;
    private SingletonLHSNOTSAFE(){}

    public static SingletonLHSNOTSAFE getInstance() {
        if (instance == null) {
            instance = new SingletonLHSNOTSAFE();
        }
        return instance;
    }
}
