package fly;

/**
 * 描述:
 * 火箭动力飞行行为
 *
 * @author dong
 * @create 2019-03-24 19:42
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
