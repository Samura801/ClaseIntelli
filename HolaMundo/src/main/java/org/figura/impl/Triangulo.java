package org.figura.impl;

import org.figura.figura;
import lombok.Data;

@Data
public abstract class Triangulo extends figura {
    protected double base;
    protected double altura;

    public double area() {
        return base * altura;
    }
}
