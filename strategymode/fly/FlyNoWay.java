package fly;

/**
 * 描述:
 * 飞行行为实现
 * 不会飞
 *
 * @author dong
 * @create 2019-03-24 19:18
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm can't fly");
    }
}
