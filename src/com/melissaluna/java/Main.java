package com.melissaluna.java;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0,figura=0, forma=0;
        boolean salir = false;

        while (!salir) {

            System.out.println("--------------------BIENVENIDO------------------------");

            System.out.println("Ingrese el numero:");
            System.out.println("Seleccionar propiedad a calcular: 1.área o 2.perímetro.");
            System.out.println("Seleccionar la figura: 3. Circulo, 4.Cuadrado, 5.Triangulo, 6.Trapecio");
            System.out.println("7.Solicitar los atributos de la figura");
            System.out.println("8.Imprimir en pantalla el resultado de los cálculos.");
            System.out.println("0.Salir");

            try {
                opcion = scanner.nextInt();


                switch (opcion) {

                    case 1: figura = 1;
                        System.out.println("Ya selecciono un número");
                        break;

                    case 2: figura= 2;
                        System.out.println("ya selecciono un número");
                        break;

                    case 3: Circle circulo = new Circle();
                        forma = 1;
                        if (figura==1){
                            System.out.println("El área es: "+circulo.area());
                        }else
                            System.out.println("El perimetro es: "+circulo.perimeter());
                        break;

                    case 4:  Square cuadrado = new Square();
                        forma= 2;
                        if (figura==1){
                            System.out.println("El área es: "+cuadrado.area());
                        }else
                            System.out.println("El perimetro es: "+cuadrado.perimeter());

                        break;

                    case 5: Triangle triangulo = new Triangle();
                        forma= 3;
                        if (figura==1){
                            System.out.println("El área es: "+triangulo.area());
                        }else
                            System.out.println("El perimetro es: "+triangulo.perimeter());

                        break;

                    case 6: Trapeze trapeze = new Trapeze();
                        forma= 4;
                        if (figura==1){
                            System.out.println("El área es: "+trapeze.area());
                        }else
                            System.out.println("El perimetro es: "+trapeze.perimeter());

                        break;
                    case 7:
                        if (forma == 1){
                            Circle circle1 = new Circle();
                        }else if (forma == 2){
                            Square square1 = new Square();
                        }else if (forma == 3){
                            Triangle triangle1 = new Triangle();
                        }else if (forma == 4){
                            Trapeze trapeze1 = new Trapeze();
                        }break;

                    case 0:
                        salir = true;
                        System.out.println("Usted salio del juego");
                        break;

                    default:
                        throw new IllegalStateException("Opción no valida " + opcion);
                }
            } catch (IllegalStateException e) {
                System.out.println("Ingresa una opción valida");
                scanner.next();
            }
        }
    }
}










