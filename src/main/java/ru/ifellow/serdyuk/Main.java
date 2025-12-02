package ru.ifellow.serdyuk;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // Метод 1: Выводит информацию об автомобилях, выпущенных после 2006 года
    public static void printCarsByYear(List<Car> cars) {
        System.out.println("\n=== АВТОМОБИЛИ ПО ГОДУ ВЫПУСКА ===");
        System.out.println("(авто после 2006 года)");
        System.out.println("=".repeat(50));

        boolean hasModernCars = false;

        for (Car car : cars) {
            if (car.getYear() > 2006) {
                System.out.println(car.getFullInfo());
                hasModernCars = true;
            } else {
                System.out.println(car + " - устаревший авто (до 2007 года)");
            }
        }

        if (!hasModernCars) {
            System.out.println("Современных автомобилей (после 2006) не найдено");
        }
    }

    // Метод 2: Изменяет цвет авто на красный, если у авто зеленый цвет
    public static void changeGreenToRed(List<Car> cars) {
        System.out.println("\n=== СМЕНА ЦВЕТА С ЗЕЛЕНОГО НА КРАСНЫЙ ===");
        System.out.println("=".repeat(50));

        int changedCount = 0;

        for (Car car : cars) {
            String currentColor = car.getColor().toLowerCase();
            if (currentColor.contains("зелен") || currentColor.equals("green")) {
                System.out.println("Найден зеленый автомобиль: " + car);
                car.changeColor("Красный");
                changedCount++;
            }
        }

        System.out.println("Итого изменено: " + changedCount + " автомобилей");
    }

    // Метод 3: Повышает цену на 10% для автомобилей старше 5 лет
    public static void increasePriceForOldCars(List<Car> cars) {
        System.out.println("\n=== ПОВЫШЕНИЕ ЦЕНЫ ДЛЯ СТАРЫХ АВТОМОБИЛЕЙ ===");
        System.out.println("(авто старше 5 лет +10% к цене)");
        System.out.println("=".repeat(50));

        int currentYear = java.time.Year.now().getValue();
        int updatedCount = 0;

        for (Car car : cars) {
            int carAge = currentYear - car.getYear();
            if (carAge > 5) {
                double oldPrice = car.getPrice();
                double newPrice = oldPrice * 1.10; // +10%

                // Используем рефлексию для изменения приватного поля
                try {
                    java.lang.reflect.Field priceField = Car.class.getDeclaredField("price");
                    priceField.setAccessible(true);
                    priceField.set(car, newPrice);

                    System.out.printf("%s: цена изменена с %,.0f на %,.0f руб. (+10%%)%n",
                            car, oldPrice, newPrice);
                    updatedCount++;
                } catch (Exception e) {
                    System.out.println("Ошибка при изменении цены: " + car);
                }
            }
        }

        System.out.println("Итого обновлено цен: " + updatedCount + " автомобилей");
    }

    // Создания списка автомобилей (хардкод данных)
    public static List<Car> createCarList() {
        List<Car> cars = new ArrayList<>();

        // Добавляем минимум 10 автомобилей
        cars.add(new Toyota("Camry", 2022, Transmission.AUTOMATIC,
                "Черный", 3500000, FuelType.HYBRID,
                2.5, true));

        cars.add(new Toyota("Corolla", 2005, Transmission.MANUAL,
                "Зеленый", 500000, FuelType.PETROL,
                1.6, false));

        cars.add(new Suzuki("Vitara", 2021, Transmission.AUTOMATIC,
                "Белый", 2200000, FuelType.PETROL,
                1.4, true));

        cars.add(new Suzuki("Swift", 2010, Transmission.MANUAL,
                "Зеленый металлик", 800000, FuelType.PETROL,
                1.2, false));

        cars.add(new BMW("X5", 2023, Transmission.AUTOMATIC,
                "Синий", 8900000, FuelType.PETROL,
                3.0, "X5"));

        cars.add(new Mercedes("C 200", 2004, Transmission.AUTOMATIC,
                "Зеленый", 900000, FuelType.DIESEL,
                2.2, "C-Class"));

        cars.add(new Honda("Civic", 2021, Transmission.MANUAL,
                "Красный", 1800000, FuelType.PETROL,
                1.8, true));

        cars.add(new Honda("Accord", 2007, Transmission.AUTOMATIC,
                "Серебристый", 1200000, FuelType.PETROL,
                2.4, false));

        cars.add(new Ford("Focus", 2015, Transmission.AUTOMATIC,
                "Синий", 1300000, FuelType.PETROL,
                2.0, false));

        cars.add(new Ford("Mustang", 2020, Transmission.AUTOMATIC,
                "Желтый", 4500000, FuelType.PETROL,
                5.0, true));

        return cars;
    }

    // Метод для отображения всех автомобилей
    public static void displayAllCars(List<Car> cars) {
        System.out.println("=== ВСЕ АВТОМОБИЛИ В СПИСКЕ ===");
        System.out.println("Всего автомобилей: " + cars.size());
        System.out.println("=".repeat(50));

        for (int i = 0; i < cars.size(); i++) {
            System.out.printf("%2d. %s%n", i + 1, cars.get(i).getFullInfo());
        }
    }

    // Главный метод
    public static void main(String[] args) {
        System.out.println("ПРОГРАММА ДЛЯ РАБОТЫ С АВТОМОБИЛЯМИ");
        System.out.println("=".repeat(50));

        // Создаем список автомобилей
        List<Car> carList = createCarList();
        // Отображаем все автомобили
        displayAllCars(carList);

        // 1 - Информация по году выпуска
        printCarsByYear(carList);

        // 2 - Изменение цвета с зеленого на красный
        changeGreenToRed(carList);

        // 3 - Повышение цены для старых автомобилей
        increasePriceForOldCars(carList);

    }
}