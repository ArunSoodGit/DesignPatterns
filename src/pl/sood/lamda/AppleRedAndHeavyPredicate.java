package pl.sood.lamda;

import static pl.sood.lamda.AppleColor.RED;

public class AppleRedAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean find(Apple apple) {
        return RED.equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
