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

import java.util.Map;

/**
 * User: yslabko
 * Date: 13.05.14
 * Time: 9:56
 */
public class MapBean {
    private Map<Long, String> nameMap;

    public Map<Long, String> getNameMap() {
        return nameMap;
    }

    public void setNameMap(Map<Long, String> nameMap) {
        this.nameMap = nameMap;
    }

    @Override
    public String toString() {
        return "MapBean{" +
                "nameMap=" + nameMap +
                '}';
    }
}
