package richard.yang.create.abstractfactory;

/**
 * 正方形
 * @author yangren
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
