package com.melissaluna.java;

public class Hexagon implements Shape {

    private double lado;
    private double apotema;


    public Hexagon(double lado, double apotema){
        this.lado = lado;
        this.apotema = apotema;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public void setApotema(double apotema){
        this.apotema = apotema;
    }
    public double getApotema(){
        return apotema;
    }

    @Override
    public double area() {
        return perimeter() * apotema / 2;
    }

    @Override
    public double perimeter() {
        return lado * 6;
    }
}
