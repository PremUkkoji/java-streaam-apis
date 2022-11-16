package exercise;

import bean.Car;
import bean.Person;
import bean.PersonDTO;
import com.google.common.collect.ImmutableList;
import data.MockData;
import org.junit.jupiter.api.Test;

import javax.annotation.concurrent.Immutable;
import java.util.List;
import java.util.stream.Collectors;

public class exercise5 {

    @Test
    public void filter() throws Exception {
        ImmutableList<Car> cars = MockData.getCars();

        List<Car> filteredCars = cars.stream()
                .filter(car -> car.getPrice() < 10000)
                .collect(Collectors.toList());

        filteredCars.forEach(System.out::println);
    }

    @Test
    public void mapping() throws Exception {
        ImmutableList<Person> people = MockData.getPeople();

        List<PersonDTO> dtos = people.stream()
                .map(person -> {
                    PersonDTO dto = new PersonDTO(person.getId(), person.getFirstName(), person.getAge());
                    return dto;
                }).collect(Collectors.toList());

        List<PersonDTO> dtos2 = people.stream()
                .map(PersonDTO::map)
                .collect(Collectors.toList());

        dtos.forEach(System.out::println);
    }

    @Test
    public void average() throws Exception {
        ImmutableList<Car> cars = MockData.getCars();

        double avg = cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);

        System.out.println(avg);
    }
}
