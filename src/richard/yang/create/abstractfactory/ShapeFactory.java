package richard.yang.create.abstractfactory;

/**
 *
 * @author yangren
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeName){
        if("CIRCLE".equals(shapeName)){
            return new Circle();
        }else if("RECTANGLE".equals(shapeName)){
            return new Rectangle();
        }else if("SQUARE".equals(shapeName)){
            return new Square();
        }
        return null;
    }
}
