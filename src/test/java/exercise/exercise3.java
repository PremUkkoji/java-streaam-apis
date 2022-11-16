package exercise;

import bean.Person;
import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class exercise3 {

    @Test
    public void min() throws Exception {
        List<Integer> numbers = ImmutableList.of(64, 72, 82, 24, 46);

        Integer mn = numbers.stream()
                .min((n1, n2) -> n1-n2)
                .get();

        // reverse order min gives maximum number
        Integer mn2 = numbers.stream()
                .min(Comparator.reverseOrder())
                .get();

        System.out.println(mn);
        System.out.println(mn2);
    }

    @Test
    public void max() throws Exception {
        List<Integer> numbers = ImmutableList.of(64, 72, 82, 24, 46);

        Integer mx = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.print(mx);
    }
}
