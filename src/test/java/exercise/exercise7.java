package exercise;

import bean.Car;
import bean.Person;
import com.google.common.collect.ImmutableList;
import data.MockData;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class exercise7 {

    @Test
    public void count() throws Exception {
        List<Person> people = MockData.getPeople();

        long count = people.stream()
                .filter(person -> person.getGender().equals("Female"))
                .count();

        System.out.println(count);
    }

    @Test
    public void min() throws Exception {
        List<Car> cars = MockData.getCars();

        double mn = cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)
                .min()
                .getAsDouble();

        System.out.println(mn);
    }

    @Test
    public void max() throws Exception {
        List<Car> cars = MockData.getCars();

        double mx = cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)
                .max()
                .getAsDouble();

        System.out.println(mx);
    }

    @Test
    public void avg() throws Exception {
        ImmutableList<Car> cars = MockData.getCars();

        double avg = cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);

        System.out.println(avg);
    }

    @Test
    public void sum() throws Exception {
        ImmutableList<Car> cars = MockData.getCars();

        double sm = cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();

        System.out.println(BigDecimal.valueOf(sm));
    }

    @Test
    public void statistics() throws Exception {
        ImmutableList<Car> cars = MockData.getCars();

        DoubleSummaryStatistics stats = cars.stream()
                .mapToDouble(Car::getPrice)
                .summaryStatistics();

        System.out.println(stats);
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getAverage());
        System.out.println(stats.getSum());
        System.out.println(stats.getCount());
    }

}
