package creational.filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        firstCriteriaItems.addAll(otherCriteriaItems);
        firstCriteriaItems = Stream.of(firstCriteriaItems.toArray(new Person[0])).distinct()
                .collect(Collectors.toList());

        return firstCriteriaItems;
    }

}
