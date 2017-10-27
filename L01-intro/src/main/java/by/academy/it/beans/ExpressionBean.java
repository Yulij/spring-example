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
package by.academy.it.beans;

import java.util.Collection;

public class ExpressionBean {
    private Double pi;
    private Double multiplier;
    private Double a;
    private Double b;
    private String value;
    private Double count = 0D;
    private Boolean logic;
    private String elvis;
    private Boolean regexp;

    private Collection<String> names;

    public ExpressionBean() {
    }

    public Double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Double multiplier) {
        this.multiplier = multiplier;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public Boolean getLogic() {
        return logic;
    }

    public void setLogic(Boolean logic) {
        this.logic = logic;
    }

    public Collection<String> getNames() {
        return names;
    }

    public void setNames(Collection<String> names) {
        this.names = names;
    }

    public String getElvis() {
        return elvis;
    }

    public void setElvis(String elvis) {
        this.elvis = elvis;
    }

    public Boolean getRegexp() {
        return regexp;
    }

    public void setRegexp(Boolean regexp) {
        this.regexp = regexp;
    }

    public Double getPi() {
        return pi;
    }

    public void setPi(Double pi) {
        this.pi = pi;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "ExpressionBean{" +
                "multiplier=" + multiplier +
                ", pi=" + pi +
                ", a=" + a +
                ", b=" + b +
                ", value='" + value + '\'' +
                ", count=" + count +
                ", logic=" + logic +
                ", elvis='" + elvis + '\'' +
                ", regexp=" + regexp +
                '}';
    }
}
