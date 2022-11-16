package exercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class exercise6 {

    @Test
    public void findAny() throws Exception {
        Integer[] numbers = {2,3,5,7,4,1};

        Integer num = Arrays.stream(numbers)
                .filter(n -> n < 10)
                .findAny()
                .get();

        System.out.println(num);
    }

    @Test
    public void findFirst() throws Exception {
        Integer[] numbers = {2,3,5,7,4,1};

        Integer num = Arrays.stream(numbers)
                .filter(n -> n > 5 && n < 10)
                .findFirst()
                .get();

        System.out.println(num);
    }
}
