package fly;

/**
 * 描述:
 * 飞行行为的实现
 * 会飞
 *
 * @author dong
 * @create 2019-03-24 19:16
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
