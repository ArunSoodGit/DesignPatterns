package pl.sood.builder;

public class Car {
    private String mark;
    private String model;
    private String color;
    private int millage;
    private double engineCapcity;

    private Car(CarBuilder builder) {
        this.mark = builder.mark;
        this.model = builder.model;
        this.color = builder.color;
        this.millage = builder.millage;
        this.engineCapcity = builder.engineCapcity;
    }


    public static class CarBuilder {
        private String mark;
        private String model;
        private String color;
        private int millage;
        private int engineCapcity;

        public CarBuilder mark(String mark) {
            this.mark = mark;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder millage(int millage) {
            this.millage = millage;
            return this;
        }

        public CarBuilder engineCapcity(int engineCapcity) {
            this.engineCapcity = engineCapcity;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", millage=" + millage +
                ", engineCapcity=" + engineCapcity +
                '}';
    }
}

