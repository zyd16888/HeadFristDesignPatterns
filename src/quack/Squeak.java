package quack;

import quack.QuackBehavior;

/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-24 19:21
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack.Squeak");
    }
}
