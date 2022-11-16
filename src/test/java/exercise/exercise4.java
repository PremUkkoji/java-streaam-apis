package exercise;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class exercise4 {

    @Test
    public void distinct() throws Exception {
        final List<Integer> numbers = ImmutableList.of(1,2,1,2,2,2,3,4,3,4,5);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctNumbers);
    }

    @Test
    public void distinctWithSet() throws Exception {
        final List<Integer> numbers = ImmutableList.of(1,2,1,2,2,2,3,4,3,4,5);

        Set<Integer> distinctNumbers = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println(distinctNumbers);
    }

}
