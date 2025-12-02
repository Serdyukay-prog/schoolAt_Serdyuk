package ru.ifellow.serdyuk;

class Mercedes extends Car {
    private String carClass;

    public Mercedes(String model, int year, Transmission transmission,
                    String color, double price, FuelType fuelType,
                    double engineVolume, String carClass) {
        super(model, year, transmission, color, price, fuelType, engineVolume);
        this.carClass = carClass;
    }

    @Override
    protected String getBrandName() {
        return "Mercedes-Benz";
    }

    public String getCarClass() {
        return carClass;
    }
}
