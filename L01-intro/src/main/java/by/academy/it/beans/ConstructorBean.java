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

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * User: yslabko
 * Date: 13.05.14
 * Time: 10:09
 */
public class ConstructorBean implements InitializingBean, BeanPostProcessor {

    String name;
    
    Integer age;

    public ConstructorBean(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct");
    }

    public ConstructorBean() {
    }

    @Override
    public String toString() {
        return "ConstructorBean{" +
           "name='" + name + '\'' +
           ", age=" + age +
           '}';
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    public void init() {
        System.out.println("Init InitializingBean");
    }

    public void initMethod() {
        System.out.println("InitMethod InitializingBean");
    }

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return null;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return null;
    }
}
