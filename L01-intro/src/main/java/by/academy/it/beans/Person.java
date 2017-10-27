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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User: yslabko
 * Date: 14.04.14
 * Time: 12:24
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    private Integer id;
    private String name;
    private String surname;
    private String beanName;

////    @Inject
////    @AddressAnnotated
////    @Company
//    @Autowired(required = false)
    private IAddress address;

    public Person(Integer id, String name, String surname, IAddress address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public IAddress getAddress() {
        return address;
    }

    public void setAddress(IAddress address) {
        this.address = address;
    }


    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        //result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                '}';
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        //To change body of implemented methods use File | Settings | File Templates.
//    }

//    @Override
//    public void destroy() throws Exception {
//        //To change body of implemented methods use File | Settings | File Templates.
//    }
}
