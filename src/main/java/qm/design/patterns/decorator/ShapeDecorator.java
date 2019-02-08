package qm.design.patterns.decorator;

/**
 * 先使用抽象类去实现和该类中引用的一样类型的接口类，
 * 这样就可以做到当子类继承该抽象类后，
 * 重写该抽象类所实现的接口类的方法，
 * 并且因为该抽象类内部引用了和其实现的接口一样的类的实例对象，
 * 子类初始化时，调用该抽象父类的构造方法，
 * 将其实现的接口的实现类赋值给其内部引用的接口类，子类就可以通过该接口实现类调用其中所实现的方法
 * 又因为子类（可以多个子类）会重写其父类所实现的接口类中的方法，所以此重写的方法中就会调用该接口的实现类中所实现的方法，
 * 然后再对此方法增加额外的操作，最终重写的方法完成
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    /**
     * 如果子类还需要再重写此方法，这里该抽象类其实就可以不需要去实现其实现的接口中的该抽象方法
     * 但为了子类能选择性地决定是否重写该抽象方法，此抽象父类需要先实现了其实现的接口中的该抽象方法
     */
    public void draw() {
        decoratedShape.draw();
    }
}
