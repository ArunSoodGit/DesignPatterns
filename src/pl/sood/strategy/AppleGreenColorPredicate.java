package pl.sood.strategy;

import static pl.sood.strategy.AppleColor.GREEN;

public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean find(Apple apple){
        return GREEN.equals(apple.getColor());
    }
}
