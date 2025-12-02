package ru.ifellow.serdyuk;
import java.util.List;

abstract class Car {
    protected String model;
    protected int year;
    protected Transmission transmission;
    protected String color;
    protected double price;
    protected FuelType fuelType;
    protected double engineVolume;

    public Car(String model, int year, Transmission transmission,
               String color, double price, FuelType fuelType,
               double engineVolume) {
        this.model = model;
        this.year = year;
        this.transmission = transmission;
        this.color = color;
        this.price = price;
        this.fuelType = fuelType;
        this.engineVolume = engineVolume;
    }
    // Метод для получения полной информации об автомобиле
    public String getFullInfo() {
        return String.format(
                "%s %s %dг. | %s | %s | %.1fл | %s | %,.0f руб.",
                getBrandName(), model, year, color,
                transmission.getDescription(), engineVolume,
                fuelType.getDescription(), price
        );
    }

    // Метод для изменения цвета автомобиля
    public void changeColor(String newColor) {
        String oldColor = this.color;
        this.color = newColor;
        System.out.printf("%s %s: цвет изменен с '%s' на '%s'%n",
                getBrandName(), model, oldColor, newColor);
    }

    // Метод для получения возраста автомобиля
    public int getCarAge() {
        return java.time.Year.now().getValue() - year;
    }

    // Абстрактный метод для получения названия марки
    protected abstract String getBrandName();

    // Геттеры
    public String getModel() { return model; }
    public int getYear() { return year; }
    public Transmission getTransmission() { return transmission; }
    public String getColor() { return color; }
    public double getPrice() { return price; }
    public FuelType getFuelType() { return fuelType; }
    public double getEngineVolume() { return engineVolume; }

    @Override
    public String toString() {
        return String.format("%s %s (%d)", getBrandName(), model, year);
    }
}
