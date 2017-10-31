package by.academy.it.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<List<Person>> getPersons() {
        List<Person> products = personService.getPersons();
        if(products.isEmpty()){ return new ResponseEntity<>(HttpStatus.NO_CONTENT); }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable("id") Long id) {
        Person product = personService.get(id);
        if (product == null) { return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
        return new ResponseEntity<>(product, HttpStatus.OK);
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
        Person product = personService.get(id);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        product.setName(newPerson.getName());
        product.setSurname(newPerson.getSurname());
        product.setAge(newPerson.getAge());
        newPerson = personService.update(product);
        return new ResponseEntity(newPerson, HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePerson(@PathVariable("id") Long id) {
        personService.delete(id);
    }
}
