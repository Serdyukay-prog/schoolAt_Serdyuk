package ru.ifellow.serdyuk;
import java.util.List;
class Suzuki extends Car {
    private boolean isFourWheelDrive;

    public Suzuki(String model, int year, Transmission transmission,
                  String color, double price, FuelType fuelType,
                  double engineVolume, boolean isFourWheelDrive) {
        super(model, year, transmission, color, price, fuelType, engineVolume);
        this.isFourWheelDrive = isFourWheelDrive;
    }

    @Override
    protected String getBrandName() {
        return "Suzuki";
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }
}