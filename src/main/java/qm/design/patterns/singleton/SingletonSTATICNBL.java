package qm.design.patterns.singleton;

public class SingletonSTATICNBL {
    private static class SingletonHolder {
        private static final SingletonSTATICNBL INSTANCE = new SingletonSTATICNBL();
    }
    private SingletonSTATICNBL (){}
    public static final SingletonSTATICNBL getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
