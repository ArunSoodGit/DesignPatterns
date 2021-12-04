package pl.sood.strategy;

public class AppleHeavyWeighPredicate implements ApplePredicate{

    @Override
    public boolean find(Apple apple) {
        return apple.getWeight() > 150;
    }
}
