package by.academy.it.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import by.academy.it.rest.entity.Person;
import by.academy.it.rest.services.IPersonService;

/**
 * Created by yslabko on 02/24/2016.
 */

@RestController
@RequestMapping("/persons")
public class PersonRestController {
    @Autowired
    private IPersonService personService;
    @GetMapping(value = "")
    public ResponseEntity<List<Person>> getPersons(
            @RequestParam(name = "name", required = false, defaultValue = "") String name,
            @RequestParam(name = "sort", required = false, defaultValue = "") String sort) {
        List<Person> products = personService.getPersons(name);
        if(products.isEmpty()){ return new ResponseEntity<>(HttpStatus.NO_CONTENT); }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable("id") Long id) {
        Person person = personService.get(id);
        if (person == null) { return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
        return new ResponseEntity<>(person, HttpStatus.OK);
    }
    @PostMapping(value = "")
    public ResponseEntity<Person> addPerson(Person person) {
        Person newPerson = personService.create(person);
        return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
    }
    @PutMapping(value = "/{id}" )
    public ResponseEntity<Person> updatePersons(
            @PathVariable("id") Long id,
            @RequestBody Person newPerson) {
        Person person = personService.get(id);
        if (person == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        person.setName(newPerson.getName());
        person.setSurname(newPerson.getSurname());
        person.setAge(newPerson.getAge());
        newPerson = personService.update(person);
        return new ResponseEntity(newPerson, HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePerson(@PathVariable("id") Long id) {
        personService.delete(id);
    }
}
