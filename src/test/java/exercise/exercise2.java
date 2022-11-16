package exercise;

import bean.Person;
import data.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;

public class exercise2 {

    @Test
    public void range() throws Exception {
        IntStream.range(0, 10)
                .forEach(System.out::print);
    }

    @Test
    public void rangeClosed() throws Exception {
        IntStream.rangeClosed(0, 10)
                .forEach(System.out::print);
    }

    @Test
    public void rangeIteratingList() throws Exception {
        List<Person> people = MockData.getPeople();

        IntStream.range(0, people.size())
                .forEach(index -> {
                    Person person = people.get(index);
                    System.out.print(person);
                });
    }

    @Test
    public void iterate() throws Exception {
        IntStream.iterate(0, operand -> operand + 1)
                .filter(number -> number % 2 == 0)
                .limit(20)
                .forEach(System.out::print);
    }
}
