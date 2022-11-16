package exercise;

import bean.Person;
import com.google.common.collect.ImmutableList;
import data.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class exercise1 {

    @Test
    public void filter() throws Exception {
        ImmutableList<Person> people = MockData.getPeople();

        List<Person> youngPeople = people
                .stream().filter(person -> person.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList());

        youngPeople.forEach(System.out::println);
    }

}
