import fly.FlyNoWay;
import quack.Quack;

/**
 * 描述:
 * 模型鸭
 * Duck实现类
 *
 * @author dong
 * @create 2019-03-24 19:38
 */
public class ModleDuck extends Duck {
    public ModleDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
