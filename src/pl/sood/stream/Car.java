package pl.sood.stream;

public class Car {
    private final String model;
    private final boolean allWheelsDrive;
    private final int mileage;
    private final Type type;

    public Car(String model, boolean allWheelsDrive, int mileage, Type type) {
        this.model = model;
        this.allWheelsDrive = allWheelsDrive;
        this.mileage = mileage;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public boolean isAllWheelsDrive() {
        return allWheelsDrive;
    }

    public int getMileage() {
        return mileage;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", allWheelsDrive=" + allWheelsDrive +
                ", mileage=" + mileage +
                ", type=" + type +
                '}';
    }

    public enum Type {SEDAN, WAGON, SUV}
    public enum OLD_LEVEL {VERY_OLD, OLD, NEW}
}
