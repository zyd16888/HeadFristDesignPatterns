package quack;


/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-24 19:20
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
