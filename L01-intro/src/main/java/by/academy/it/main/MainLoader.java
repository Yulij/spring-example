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
package by.academy.it.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.academy.it.beans.PrototypeBean;

/**
 * User: yslabko
 * Date: 08.05.14
 * Time: 9:35
 */
public class MainLoader {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("springLifeCycle.xml");

        PrototypeBean prototypeBean = (PrototypeBean) context.getBean("prototypeBeanDemo");
        System.out.println(prototypeBean.getAge());
        prototypeBean.setAge(-1);
        PrototypeBean prototype = (PrototypeBean) context.getBean("prototypeBeanDemo");
        System.out.println(prototype.getAge());

        ((ClassPathXmlApplicationContext) context).close();
    }
}

