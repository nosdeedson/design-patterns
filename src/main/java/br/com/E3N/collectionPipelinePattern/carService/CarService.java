package br.com.E3N.collectionPipelinePattern.carService;

import br.com.E3N.collectionPipelinePattern.car.Car;
import br.com.E3N.collectionPipelinePattern.car.CarCategory;
import br.com.E3N.collectionPipelinePattern.person.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Why Car service?
 * Because it handles cars objects but the operations are not related with any business rule.
 * And it is not so generic to be a Util class, utils classes are those relating with formating a date
 */
public class CarService {

    public static List<String> getModelsAfter200( final List<Car> cars){
        return cars.stream()
                .filter(it -> it.getYear() > 2000)
                .sorted(Comparator.comparing(Car::getYear))
                .map(Car::getModel)
                .collect(Collectors.toList());
    }

    public static Map<CarCategory, List<Car>> getGroupingOfCarsByCategory(final List<Car> cars){
        return cars.stream()
                .collect(Collectors.groupingBy(Car::getCategory));
    }

    public static List<Car> getSedanCarsOwnedSortedByCategory(final List<Person> people){
        return people.stream()
                .flatMap(person -> person.getCars().stream())
                .filter(car -> CarCategory.SEDAN.equals(car.getCategory()))
                .sorted(Comparator.comparing(Car::getYear))
                .collect(Collectors.toList());
    }
}
