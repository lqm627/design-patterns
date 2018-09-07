package qm.design.patterns.singleton;

public class SingletonEHS {
    private static SingletonEHS instance = new SingletonEHS();
    private SingletonEHS (){}
    public static SingletonEHS getInstance() {
        return instance;
    }
}
