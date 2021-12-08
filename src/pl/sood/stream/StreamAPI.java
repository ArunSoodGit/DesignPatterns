package pl.sood.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Audi", true, 12000, Car.Type.SUV),
                new Car("BMW", false, 4000, Car.Type.WAGON),
                new Car("Audi", false, 160000, Car.Type.SEDAN),
                new Car("FORD", true, 2000, Car.Type.SEDAN),
                new Car("SEAT", true, 14500, Car.Type.WAGON),
                new Car("KIA", false, 10133, Car.Type.WAGON),
                new Car("MERCEDES", true, 12460, Car.Type.SUV),
                new Car("SKODA", false, 11900, Car.Type.SEDAN)
        );

//        getThreeCarsWithHighestMileage(cars);
//
//        getAllWheelCars(cars);
//
//        getListWithCarsModelLengths(cars);
//
//        findDistinctCharacterInArrayOfWords();
//
//        groupCarByType(cars);
//
//        filterAndGroupCar(cars);
//
//        filterAndGroupCar2(cars);
//
//        groupCarByMileage(cars);

        showCarTypesCount(cars);
    }

    private static void getThreeCarsWithHighestMileage(List<Car> cars) {
        //Displays 3 car names with the mileage greater than 10000

        List<String> threeCarNamesWithHighMileage = cars.stream().filter(car -> car.getMileage() > 10000)
                .map(Car::getModel)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(threeCarNamesWithHighMileage);
    }

    private static void getAllWheelCars(List<Car> cars) {
        //List of AWD cars

        List<Car> awdCars = cars.stream()
                .filter(Car::isAllWheelsDrive)
                .collect(Collectors.toList());
        System.out.println(awdCars);
    }

    private static void getListWithCarsModelLengths(List<Car> cars) {
        //

        List<Integer> carModelLengths = cars.stream()
                .map(Car::getModel)
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(carModelLengths);
    }

    private static void findDistinctCharacterInArrayOfWords() {
        // flatMap output: [H, e, l, o, W, r, d]

        String[] arrayOfWords = {"Hello", "World"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
        List<String> distinctCharacters = streamOfWords
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctCharacters);
    }

    private static void groupCarByType(List<Car> cars) {
        ///
        Map<Car.Type, List<Car>> carsByType = cars.stream()
                .collect(Collectors.groupingBy(Car::getType));

        System.out.println(carsByType);
    }

    private static void filterAndGroupCar(List<Car> cars) {
        ///
        Map<Car.Type, List<Car>> carsByTypeWithLowMileage = cars.stream()
                .collect(Collectors.groupingBy(Car::getType, Collectors.filtering(car -> car.getMileage() < 10000, Collectors.toList())));

        System.out.println(carsByTypeWithLowMileage);
    }

    private static void filterAndGroupCar2(List<Car> cars) {
        /// or lost one empty Type
        Map<Car.Type, List<Car>> carsByTypeWithLowMileage2 = cars.stream()
                .filter(car -> car.getMileage() < 10000)
                .collect(Collectors.groupingBy(Car::getType));

        System.out.println(carsByTypeWithLowMileage2);
    }

    private static void groupCarByMileage(List<Car> cars) {
        Map<Car.Type, Map<Car.OLD_LEVEL, List<Car>>> groupCars =
                cars.stream().collect(
                        Collectors.groupingBy(Car::getType,
                        Collectors.groupingBy(car -> {
                            if (car.getMileage() <= 10000) return Car.OLD_LEVEL.NEW;
                            else if (car.getMileage() <= 100000) return Car.OLD_LEVEL.OLD;
                            else return Car.OLD_LEVEL.VERY_OLD;
                        })
                )
                );


        System.out.println(groupCars);
    }

    private static void showCarTypesCount(List<Car> cars) {
        Map<Car.Type, Long> typesCount =
                cars.stream()
                        .collect(Collectors.groupingBy(Car::getType, Collectors.counting()));

        System.out.println(typesCount);
    }


}
