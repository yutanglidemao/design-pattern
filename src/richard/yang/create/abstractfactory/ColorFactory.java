package richard.yang.create.abstractfactory;

/**
 * 颜色工厂类
 * @author yangren
 */
public class ColorFactory extends AbstractFactory{

    @Override
    public Color getColor(String color){
        if("BLUE".equals(color)){
            return new Blue();
        }
        if("GREEN".equals(color)){
            return new Green();
        }
        if("RED".equals(color)){
            return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
