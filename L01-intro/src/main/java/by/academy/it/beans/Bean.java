/*
 * Copyright (C) 2014 GHX, Inc.
 *  Louisville, Colorado, USA.
 *  All rights reserved.
 *
 *  Warning: Unauthorized reproduction or distribution of this program, or
 *  any portion of it, may result in severe civil and criminal penalties,
 *  and will be prosecuted to the maximum extent possible under the law.
 *
 *  Created on 010 10.10.2014
 */
package by.academy.it.beans;

public class Bean {

    private by.academy.it.components.Person person;

    public by.academy.it.components.Person getPerson() {
        return person;
    }

    public void setPerson(by.academy.it.components.Person person) {
        this.person = person;
    }
}
