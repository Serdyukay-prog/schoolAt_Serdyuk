package ru.ifellow.serdyuk;

public enum FuelType {
    PETROL("Бензин"),
    DIESEL("Дизель"),
    HYBRID("Гибрид"),
    ELECTRIC("Электрический");

    private final String description;

    FuelType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
