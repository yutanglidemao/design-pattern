package richard.yang.create.factory;

/**
 * 工厂模式demo
 * 工厂模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象
 * 主要解决：主要解决接口选择的问题
 * 何时使用：明确计划不同条件下创建不同实例
 * 关键代码：创建过程在子类执行
 *
 * @author yangren
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("CIRCLE").draw();
        shapeFactory.getShape("SQUARE").draw();
        shapeFactory.getShape("RECTANGLE").draw();
    }
}
