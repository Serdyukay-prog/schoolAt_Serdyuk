package ru.ifellow.serdyuk;

public enum Transmission {
    MANUAL("Механическая"),
    AUTOMATIC("Автоматическая"),
    ROBOT("Роботизированная"),
    CVT("Вариатор");


    private final String description;

    Transmission(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

