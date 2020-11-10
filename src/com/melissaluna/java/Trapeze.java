package com.melissaluna.java;

import java.util.Scanner;

public class Trapeze implements Shape{

    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado;

    public Trapeze(double baseMayor, double baseMenor, double altura, double lado){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado = lado;

    }

    public Trapeze() {
        System.out.println("Ingresa el Valor de la base mayor");
        Scanner scanner = new Scanner(System.in);
        baseMayor = scanner.nextDouble();

        System.out.println("Ingresa el Valor de la base menor");
        Scanner scanner2 = new Scanner(System.in);
        baseMenor = scanner.nextDouble();

        System.out.println("Ingresa el Valor de la altura");
        Scanner scanner3 = new Scanner(System.in);
        altura = scanner.nextDouble();

        System.out.println("Ingresa el Valor del lado");
        Scanner scanner4 = new Scanner(System.in);
        lado = scanner.nextDouble();

    }

    public void setBaseMayor(double baseMayor){
        this.baseMayor = baseMayor;
    }

    public double getBaseMayor(){
        return baseMayor;
    }

    public void setBaseMenor(double baseMenor){
        this.baseMenor = baseMenor;
    }
    public double getBaseMenor(){
        return baseMenor;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }
    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double area() {
        return (baseMayor * baseMenor) * altura / 2;
    }

    @Override
    public double perimeter() {
        return baseMayor + baseMenor + lado + lado;
    }
}
