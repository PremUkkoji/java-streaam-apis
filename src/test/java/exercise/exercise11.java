package exercise;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class exercise11 {

    @Test
    public void join() throws Exception {
        List<String> names = List.of("prem", "shrikant", "ukkoji");

        String join = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));

        System.out.println(join);
    }
}
