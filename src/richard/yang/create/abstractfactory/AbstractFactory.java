package richard.yang.create.abstractfactory;

/**
 * 抽象工厂
 * @author yangren
 */
public abstract class AbstractFactory {
    /**
     * 获取颜色
     * @param color
     * @return
     */
    public abstract Color getColor(String color);

    /**
     * 获取形状
     * @param shape
     * @return
     */
    public abstract Shape getShape(String shape);
}
