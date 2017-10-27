/*
 * Copyright (C) 2014 GHX, Inc.
 *  Louisville, Colorado, USA.
 *  All rights reserved.
 *
 *  Warning: Unauthorized reproduction or distribution of this program, or
 *  any portion of it, may result in severe civil and criminal penalties,
 *  and will be prosecuted to the maximum extent possible under the law.
 *
 *  Created on 022 22.07.2014
 */
package by.academy.it.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.academy.it.beans.CollectionBean;

public class SpringExpressions {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-expressions.xml");
//        ExpressionBean bean = (ExpressionBean) context.getBean("eb");
//        System.out.println(bean);

//        _Person person = (_Person) context.getBean("person");
//        System.out.println(person);

        CollectionBean coll = (CollectionBean) context.getBean("collectionBean");
        System.out.println(coll);

//        ConstructorBean coll = (ConstructorBean) context.getBean("constructor");
//        System.out.println(coll);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
