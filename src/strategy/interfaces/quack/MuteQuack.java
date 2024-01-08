package strategy.interfaces.quack;

import strategy.interfaces.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("조용");
    }
}
