package by.academy.it.services;

import by.academy.it.rest.entity.Person;

import java.util.List;

public interface IPersonService {

    List<Person> getPersons();

    Person create(Person person);

    void delete(Person person);
}
