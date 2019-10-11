package code.pattern._2_filter.filterClass;

import code.pattern._2_filter.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PeopleHeightFilter implements Filter<Person> {
    @Override
    public List<Person> filter(List<Person> data) {
//        return data.stream()._2_filter(person -> person.getHeight() > 170.00).collect(Collectors.toList());
        List<Person> people = new ArrayList<>();
        for (int i = 0, size = data.size(); i < size; i++) {
            if (data.get(i).getHeight() > 170.00) {
                people.add(data.get(i));
            }
        }
        return people;
    }
}
