package ru.ifellow.serdyuk;

class Ford extends Car {
    private boolean isAmericanSpec;

    public Ford(String model, int year, Transmission transmission,
                String color, double price, FuelType fuelType,
                double engineVolume, boolean isAmericanSpec) {
        super(model, year, transmission, color, price, fuelType, engineVolume);
        this.isAmericanSpec = isAmericanSpec;
    }

    @Override
    protected String getBrandName() {
        return "Ford";
    }

    public boolean isAmericanSpec() {
        return isAmericanSpec;
    }
}
