package org.figura.impl;

import org.figura.figura;
import lombok.Data;

@Data
public class Cuadrado extends figura {
    private double lado;
    @Override
    public double perimetro() {
        return lado * 4;
    }
    @Override
    public double area() {
        return lado * lado;
    }
}
