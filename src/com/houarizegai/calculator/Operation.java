/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.houarizegai.calculator;

import java.awt.Font;

/**
 *
 * @author Milen Ortega Hp
 */
public class Operation {
      
    protected double x;
    protected double y;

    public Operation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calc(char opt) {
        
        if (opt == '+') {
            return x + y;
        } else if (opt == '-') {
            return x - y;
        } else if (opt == '*') {
            return x * y;
        } else if (opt == '/') {
            return x / y;
        } else if (opt == '%') {
            return x % y;
        } else if (opt == '^') {
            return Math.pow(x, y);
        }
        
        return y;
    }

    
    
  
    
    
}
