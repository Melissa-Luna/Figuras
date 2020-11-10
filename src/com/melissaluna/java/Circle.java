package com.melissaluna.java;

import java.util.Scanner;

public class Circle implements Shape {

    public static final double PI = 3.141592;
    protected double radio;

    public Circle(double radio){
        this.radio = radio;
    }

    public Circle() {
        System.out.println("Ingresa el Valor del radio");
        Scanner scanner = new Scanner(System.in);
        radio = scanner.nextDouble();

    }

    public void  setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public double getDiametro(){
        return radio * 2;
    }

    @Override
    public double area() {
        return PI * radio * radio;
    }

    @Override
    public double perimeter() {
        return PI * getDiametro();
    }
}
