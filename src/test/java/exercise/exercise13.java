package exercise;

import bean.Car;
import data.MockData;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercise13 {

    @Test
    public void intermediateAndTerminalOperations() throws Exception {
        List<Double> updatedPrices = MockData.getCars()
                .stream()
                .filter(car -> car.getPrice() < 10000)
                .map(car -> car.getPrice())
                .map(price -> price * 0.14)
                .collect(Collectors.toList());

        System.out.println(updatedPrices);
    }

}
