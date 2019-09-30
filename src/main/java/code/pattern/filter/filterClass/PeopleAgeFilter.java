package code.pattern.filter.filterClass;

import code.pattern.filter.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleAgeFilter implements Filter<Person> {
    @Override
    public List<Person> filter(List<Person> data) {
        //        return data.stream().filter(person -> person.getAge()>22).collect(Collectors.toList());
        List<Person> people = new ArrayList<>();
        for (int i = 0, size = data.size(); i < size; i++) {
            if (data.get(i).getAge() > 22) {
                people.add(data.get(i));
            }
        }
        return people;
    }
}
