package pl.sood.strategy.withLambda;

import pl.sood.strategy.basic.ValidationStrategy;

public class LambdaValidator {
    private final ValidationStrategy strategy;

    public LambdaValidator(ValidationStrategy s) {
        this.strategy = s;
    }

    public boolean validate(String s) {
        return strategy.execute(s);
    }
}
