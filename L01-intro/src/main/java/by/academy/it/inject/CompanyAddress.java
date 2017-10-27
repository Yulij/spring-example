/*
 * Copyright (C) 2014 GHX, Inc.
 *  Louisville, Colorado, USA.
 *  All rights reserved.
 *
 *  Warning: Unauthorized reproduction or distribution of this program, or
 *  any portion of it, may result in severe civil and criminal penalties,
 *  and will be prosecuted to the maximum extent possible under the law.
 *
 *  Created on 016 16.05.2014
 */
package by.academy.it.inject;

import org.springframework.stereotype.Component;

@Company
@Component
public class CompanyAddress implements IAddress {
    private Long id;
    private String street;
    private Long home;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getHome() {
        return home;
    }

    public void setHome(Long home) {
        this.home = home;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CompanyAddress{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", home=" + home +
                ", email='" + email + '\'' +
                '}';
    }
}
