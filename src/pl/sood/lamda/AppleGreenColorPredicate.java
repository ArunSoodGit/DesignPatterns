package pl.sood.lamda;

import static pl.sood.lamda.AppleColor.GREEN;

public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean find(Apple apple){
        return GREEN.equals(apple.getColor());
    }
}
