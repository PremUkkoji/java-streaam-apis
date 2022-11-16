package exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercise12 {
    @Test
    public void collect() throws Exception {
        List<String> names = List.of("prem", "shrikant", "ukkoji");

        List<String> lst = names.stream()
                .collect(
                        () -> new ArrayList(),
                        (lst1, name) -> lst1.add(name),
                        (lst1, lst2) -> lst1.addAll(lst2)
                );

        System.out.println(lst);

        List<String> lst3 = names.stream()
                .collect(
                        ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll
                );

        System.out.println(lst3);
    }
}
