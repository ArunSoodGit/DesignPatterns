package pl.sood.decorator;

public class Main {
    public static void main(String[] args) {
        Car i20Car = new i20Car();
        System.out.println(i20Car.price());

        Car i20carWithArmrest = new Armrest(new Navigation(i20Car));

        System.out.println(i20carWithArmrest.price());
    }
}
