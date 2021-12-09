package pl.sood.strategy;

public class Main {
    public static void main(String[] args) {
        Validator numericValidator = new Validator(new IsNumeric());
        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());

        boolean b1 = numericValidator.validate("123");
        boolean b2 = numericValidator.validate("HELLO");

        boolean b3 = lowerCaseValidator.validate("WORD");
        boolean b4 = lowerCaseValidator.validate("test");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
