package strategy.interfaces.fly;

import strategy.interfaces.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날고 있어요!");
    }
}
