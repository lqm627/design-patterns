package qm.design.patterns.builder;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    //CAUTION 抽象类没实现所实现接口的方法不需要再显式地声明
//    @Override
//    public abstract float price();
}
