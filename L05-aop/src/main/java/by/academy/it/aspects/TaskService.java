/*
 * Copyright (C) 2014 GHX, Inc.
 *  Louisville, Colorado, USA.
 *  All rights reserved.
 *
 *  Warning: Unauthorized reproduction or distribution of this program, or
 *  any portion of it, may result in severe civil and criminal penalties,
 *  and will be prosecuted to the maximum extent possible under the law.
 *
 *  Created on 001 01.08.2014
 */
package by.academy.it.aspects;

import org.springframework.stereotype.Service;

@Service("taskService")
public class TaskService {

    public void performJob() {
        System.out.println("Perform Job");
    }

    public String performJobAround() {
        System.out.println("Perform around Job");
        return "SUCCESS";
    }


    public void performExceptionJob() throws Exception {
        System.out.println("Throw exception in Job");
        throw new Exception("ExceptionJob");
    }

    public void performJob(String newName) {
        System.out.println("Job name: " + newName);
    }
}
