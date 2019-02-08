package qm.design.patterns.builder;

public class VegBurger extends Burger {

    /**
     * 子类必须实现父类中的所有抽象方法，
     * 包括当父类为抽象类时，
     * 所实现的接口中没实现的抽象方法
     */

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
