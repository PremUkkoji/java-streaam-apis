package exercise;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercise10 {

    private static final List<List<String>> lsts = Lists.newArrayList(
            Lists.newArrayList("prem", "praveen"),
            Lists.newArrayList("prem", "shrikant", "susha"),
            Lists.newArrayList("susha", "shrikant")
    );

    @BeforeAll
    public static void setup() throws Exception {
        System.out.println(lsts);
    }

    @Test
    public void flatMap() throws Exception {
        List<String> names = lsts.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(names);
    }

}
