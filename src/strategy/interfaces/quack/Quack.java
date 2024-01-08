package strategy.interfaces.quack;

import strategy.interfaces.quack.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
