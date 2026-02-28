package br.com.E3N.collectionPipelinePattern;

import br.com.E3N.collectionPipelinePattern.car.Car;
import br.com.E3N.collectionPipelinePattern.car.CarCategory;
import br.com.E3N.collectionPipelinePattern.carService.CarService;
import br.com.E3N.collectionPipelinePattern.person.Person;

import java.util.List;
import java.util.Map;

public class App {

    public static void execute(){
        List<Car> cars = List.of(
                new Car(CarCategory.SEDAN, "Toyota", 1998, "Red", "Corolla"),      // older than 2000
                new Car(CarCategory.SUV, "Ford", 2015, "Black", "Explorer"),
                new Car(CarCategory.HATCHBACK, "Volkswagen", 2018, "White", "Golf"),
                new Car(CarCategory.PICKUP, "Chevrolet", 2021, "Blue", "Silverado"),
                new Car(CarCategory.SEDAN, "Honda", 2005, "Silver", "Civic")
        );

        var person = new Person("Edson", List.of(
                cars.get(0), cars.get(1)
        ));
        var person2 = new Person("Lucina", cars);

        var recentsCart = CarService.getModelsAfter200(cars);

        System.out.println("Recent cars");
        recentsCart.forEach(System.out::println);

        var carCategories = CarService.getGroupingOfCarsByCategory(cars);

        System.out.println("Grouping by category");
        carCategories.forEach((key, value) -> {
            System.out.println("Category: " + key);
            value.forEach(System.out::println);
        });

        System.out.println("My Sedans");
        var mySedans = CarService.getSedanCarsOwnedSortedByCategory(List.of(person2, person));
        mySedans.forEach(System.out::println);
    }
}
