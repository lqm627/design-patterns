package qm.design.patterns.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    //NOTE 此方法就是装饰器模式的关键之处，对其父类中引用的接口类，调用其接口实现类的相应方法，对此方法进行额外处理，乃装饰器模式的作用
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
