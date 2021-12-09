package pl.sood.strategy.basic;

public class Validator {
    private final ValidationStrategy strategy;

    public Validator(ValidationStrategy s) {
        this.strategy = s;
    }

    public boolean validate(String s) {
        return strategy.execute(s);
    }
}
