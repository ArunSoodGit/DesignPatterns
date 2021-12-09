package pl.sood.strategy.basic;

public class IsAllLowerCase implements ValidationStrategy{

    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
