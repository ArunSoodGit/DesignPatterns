package pl.sood.decorator;

public class i20Car extends Car {
    @Override
    public float price() {
        return 20000;
    }

    @Override
    public String description() {
        return "Hyundai i20";
    }


}
