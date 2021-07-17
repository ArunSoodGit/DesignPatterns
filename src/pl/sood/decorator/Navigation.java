package pl.sood.decorator;

public class Navigation extends CarAccessoriesDecorator {
    private Car car;

    public Navigation(Car car) {
        this.car = car;
    }

    @Override
    public float price() {
        return car.price() + 2300;
    }

    @Override
    public String description() {
        return car.description() + " with navigation";
    }
}
