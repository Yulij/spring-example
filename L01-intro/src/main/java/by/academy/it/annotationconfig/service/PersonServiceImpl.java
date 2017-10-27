package by.academy.it.annotationconfig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.academy.it.annotationconfig.pojos.Person;

/**
 * Class PersonServiceImpl
 *
 * Created by yslabko on 11/30/2016.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private Person person;


    public String getPersonName() {
        return person.getName();
    }
}
