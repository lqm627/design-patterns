package qm.design.patterns.singleton;

public class SingletonDCL {
    private volatile static SingletonDCL singleton;

    private SingletonDCL() {
    }

    public static SingletonDCL getSingleton() {
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if (singleton == null) {
            //同步块，线程安全的创建实例
            synchronized (SingletonDCL.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if (singleton == null) {
                    singleton = new SingletonDCL();
                }
            }
        }
        return singleton;
    }
}
