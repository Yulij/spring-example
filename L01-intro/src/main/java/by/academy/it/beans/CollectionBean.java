/*
 * Copyright (c) 2012 by VeriFone, Inc.
 * All Rights Reserved.
 *
 * THIS FILE CONTAINS PROPRIETARY AND CONFIDENTIAL INFORMATION
 * AND REMAINS THE UNPUBLISHED PROPERTY OF VERIFONE, INC.
 *
 * Use, disclosure, or reproduction is prohibited
 * without prior written approval from VeriFone, Inc.
 */
package by.academy.it.beans;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

import lombok.Data;

/**
 * User: yslabko
 * Date: 13.05.14
 * Time: 9:43
 */
@Data
public class CollectionBean {
    private Set<String> names;
    private Collection<String> cars;
    private Collection<Person> persons;
    private String[] cities;
    private String beanName;

    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }

    public Collection<String> getCars() {
        return cars;
    }

    public void setCars(Collection<String> cars) {
        this.cars = cars;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }

    public Collection<Person> getPersons() {
        return persons;
    }

    public void setPersons(Collection<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "names=" + names +
                ", cars=" + cars +
                ", persons=" + persons +
                ", cities=" + Arrays.toString(cities) +
                '}';
    }
}
