package qm.design.patterns.filterOrcriteria;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
