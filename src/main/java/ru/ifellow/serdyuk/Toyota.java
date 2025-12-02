package ru.ifellow.serdyuk;
import java.util.List;

class Toyota extends Car {
    private boolean hasHybridSystem;

    public Toyota(String model, int year, Transmission transmission,
                  String color, double price, FuelType fuelType,
                  double engineVolume, boolean hasHybridSystem) {
        super(model, year, transmission, color, price, fuelType, engineVolume);
        this.hasHybridSystem = hasHybridSystem;
    }

    @Override
    protected String getBrandName() {
        return "Toyota";
    }

    public boolean hasHybridSystem() {
        return hasHybridSystem;
    }
}
