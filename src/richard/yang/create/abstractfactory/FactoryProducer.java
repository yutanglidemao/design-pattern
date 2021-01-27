package richard.yang.create.abstractfactory;

/**
 * @author yangren
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if("SHAPE".equals(choice)){
            return new ShapeFactory();
        }
        if("COLOR".equals(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
