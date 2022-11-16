package exercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class exercise9 {

    @Test
    public void reduce() throws Exception {
        Integer[] numbers = {2,3,5,7,4,1};

        int sm = Arrays.stream(numbers)
                .reduce(0, (a, b) -> a+b);

        System.out.println(sm);

        int sm2 = Arrays.stream(numbers)
                .reduce(0, Integer::sum);

        System.out.println(sm2);
    }

}
