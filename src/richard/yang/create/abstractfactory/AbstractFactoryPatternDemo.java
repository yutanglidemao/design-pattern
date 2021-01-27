package richard.yang.create.abstractfactory;

/**
 * 抽象工厂模式demo
 *
 *
 *
 * @author yangren
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape = abstractFactory.getShape("CIRCLE");
        shape.draw();
        abstractFactory = FactoryProducer.getFactory("COLOR");
        Color color = abstractFactory.getColor("RED");
        color.fill();
    }

}
