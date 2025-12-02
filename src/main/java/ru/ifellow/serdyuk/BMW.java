package ru.ifellow.serdyuk;
import java.util.List;
class BMW extends Car {
    private String series;

    public BMW(String model, int year, Transmission transmission,
               String color, double price, FuelType fuelType,
               double engineVolume, String series) {
        super(model, year, transmission, color, price, fuelType, engineVolume);
        this.series = series;
    }

    @Override
    protected String getBrandName() {
        return "BMW";
    }

    public String getSeries() {
        return series;
    }
}

