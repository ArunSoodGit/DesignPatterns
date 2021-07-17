package pl.sood.builder;

public class CarController {

    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .color("Czerwony")
                .mark("Audi")
                .model("A6")
                .millage(120000)
                .engineCapcity(20000)
                .build();

        System.out.println(car); 
    }
}
