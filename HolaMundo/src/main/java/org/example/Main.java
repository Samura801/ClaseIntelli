package org.example;

import org.figura.figura;
import org.figura.impl.Cuadrado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        figura figura = new Cuadrado();
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);

        System.out.println(figura.area());
        System.out.println(figura.perimetro());
        
        System.out.println(cuadrado.area());
        System.out.println(cuadrado.perimetro());
    }
}
