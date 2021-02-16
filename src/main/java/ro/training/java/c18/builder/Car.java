package ro.training.java.c18.builder;

public class Car {
    private String brand;
    private String model;
    private int year;
    private long maxSpeed;

    public String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    public long getMaxSpeed() {
        return maxSpeed;
    }

    void setMaxSpeed(long maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
