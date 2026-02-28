package br.com.E3N.collectionPipelinePattern.car;

import java.util.Objects;

public class Car {
    private final CarCategory category;
    private final String brand;
    private final int year;
    private final String color;
    private final String model;

    public Car(CarCategory category, String brand, int year, String color, String model) {
        this.category = category;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public CarCategory getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && category == car.category && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, brand, year, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "category=" + category +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
