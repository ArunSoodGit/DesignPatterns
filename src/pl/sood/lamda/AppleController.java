package pl.sood.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static pl.sood.lamda.AppleColor.GREEN;
import static pl.sood.lamda.AppleColor.RED;

public class AppleController {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(AppleColor.RED, 220), new Apple(AppleColor.RED, 140), new Apple(GREEN, 240));
        List<Apple> greenAppleClassic = filterGreenApples(inventory);

        List<Apple> greenApples = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println("greenApples: ");
        System.out.println(greenApples);

        List<Apple> redAndHeavyApples = filterApples(inventory, new AppleRedAndHeavyPredicate());
        System.out.println("redAndHeavyApples: ");
        System.out.println(redAndHeavyApples);

        List<Apple> heavyApples = filterApples(inventory, new AppleHeavyWeighPredicate());
        System.out.println("heavyApples: ");
        System.out.println(heavyApples);



        ////////// Klasy anonimowe //////////

        List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean find(Apple apple) {
                return RED.equals(apple.getColor());
            }
        });

        System.out.println("redApples z klasy anonimowej");
        System.out.println(redApples);

////////////// Wyra¿enia lambda /////////////////////

        List<Apple> redApplesByLambda = filterApples(inventory, (apple) -> RED.equals(apple.getColor()));
        System.out.println("redApplesByLambda");
        System.out.println(redApplesByLambda);
        List<Apple> greenAndWeightApplesByLambda = filterApples(inventory, (Apple apple) -> GREEN.equals(apple.getColor()) && apple.getWeight() > 150);
        List<Apple> heavyApplesByLambda = filterApples(inventory, (Apple apple) -> apple.getWeight() > 150);

    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.find(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
