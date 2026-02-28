package br.com.E3N.collectionPipelinePattern.person;

import br.com.E3N.collectionPipelinePattern.car.Car;

import java.util.List;

public class Person {
    private final String nameOwner;
    private final List<Car> cars;

    public Person(String nameOwner, List<Car> cars) {
        this.nameOwner = nameOwner;
        this.cars = cars;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public List<Car> getCars() {
        return cars;
    }
}
