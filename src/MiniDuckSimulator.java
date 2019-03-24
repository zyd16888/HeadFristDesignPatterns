import fly.FlyRocketPowered;

/**
 * 描述:
 * 测试类
 *
 * @author dong
 * @create 2019-03-24 19:31
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        Duck model = new ModleDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
