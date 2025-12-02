package ru.ifellow.serdyuk;

class Honda extends Car {
    private boolean hasVTEC;

    public Honda(String model, int year, Transmission transmission,
                 String color, double price, FuelType fuelType,
                 double engineVolume, boolean hasVTEC) {
        super(model, year, transmission, color, price, fuelType, engineVolume);
        this.hasVTEC = hasVTEC;
    }

    @Override
    protected String getBrandName() {
        return "Honda";
    }

    public boolean hasVTEC() {
        return hasVTEC;
    }
}

