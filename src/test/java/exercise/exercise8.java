package exercise;

import bean.Car;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import data.MockData;
import org.junit.jupiter.api.Test;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class exercise8 {

    @Test
    public void simpleGrouping() throws Exception {
        Map<String, List<Car>> grps =  MockData.getCars()
                .stream()
                .collect(Collectors.groupingBy(Car::getMake));

        grps.forEach((make, cars) -> {
            System.out.println(make);
            cars.forEach(System.out::println);
        });
    }

    @Test
    public void groupingByCounting() throws Exception {
        List<String> names = List.of("prem", "premukkoji", "premukkoji", "prem", "premukkoji");

        Map<String, Long> mp = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        mp.forEach((name, count) -> {
            System.out.println(name + " -> " + count);
        });
    }
}
