package strategy.interfaces.quack;

import strategy.interfaces.quack.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("삑");
    }
}
