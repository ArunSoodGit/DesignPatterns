package pl.sood.strategy;

import static pl.sood.strategy.AppleColor.RED;

public class AppleRedAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean find(Apple apple) {
        return RED.equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
