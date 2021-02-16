package ro.training.java.c18.builder;

public class CarBuilder {
    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    public CarBuilder brand(String brand) {
        this.car.setBrand(brand);
        return this;
    }

    public CarBuilder model(String model) {
        this.car.setModel(model);
        return this;
    }

    public CarBuilder year(int year) {
        this.car.setYear(year);
        return this;
    }

    public CarBuilder maxSpeed(long maxSpeed) {
        this.car.setMaxSpeed(maxSpeed);
        return this;
    }

    public Car build() {
        return this.car;
    }
}
