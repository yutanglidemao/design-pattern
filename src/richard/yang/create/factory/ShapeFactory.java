package richard.yang.create.factory;

/**
 *
 * @author yangren
 */
public class ShapeFactory {

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
