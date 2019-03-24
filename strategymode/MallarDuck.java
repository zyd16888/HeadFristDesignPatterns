import fly.FlyWithWings;
import quack.Quack;

/**
 * 描述:
 * Duck 子类  ， 具体实现方法
 *
 * @author dong
 * @create 2019-03-24 19:22
 */
public class MallarDuck extends Duck {
    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
