package pl.sood.strategy.withLambda;

import pl.sood.strategy.basic.Validator;

public class Main {
    public static void main(String[] args) {
        LambdaValidator numericValidator = new LambdaValidator(s -> s.matches("\\d+"));
        boolean b1 = numericValidator.validate("123");
        LambdaValidator lowerCaseValidator = new LambdaValidator(s -> s.matches("[a-z]+"));
        boolean b2 = lowerCaseValidator.validate("ARUN");

        System.out.println(b1);
        System.out.println(b2);
    }
}
