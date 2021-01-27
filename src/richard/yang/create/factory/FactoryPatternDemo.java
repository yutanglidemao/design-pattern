package richard.yang.create.factory;

/**
 * 工厂模式demo
 * 
 *
 *
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
