/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.exercise.bisect;

/**
 *
 * @author loki
 */
public class Polynom {
    
    private final Integer x4, x3, x2, x1, x0;
    
    public Polynom(Integer x4, Integer x3, Integer x2, Integer x1, Integer x0) {
        this.x4 = x4;
        this.x3 = x3;
        this.x2 = x2;
        this.x1 = x1;
        this.x0 = x0;
    }
    
    public double calc(double xValue) {
        
        return x4.doubleValue() * Math.pow(xValue, 4)
             + x3.doubleValue() * Math.pow(xValue, 3)
             + x2.doubleValue() * Math.pow(xValue, 2)
             + x1.doubleValue() * Math.pow(xValue, 1)
             + x0.doubleValue();
    }
    
    
}
