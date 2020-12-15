package Chapter4;


/*
 * DO WHILE LOOP:
 * Programa que permite sumar 2 numeros las veces que el usuario desee.
 */


import java.util.Scanner;

public class DoWhile {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        boolean otravez;

        do{
            System.out.println("Ingresa el primer numero");
            double num1 = scanner.nextDouble();

            System.out.println("Ingresa el segundo numero");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("La suma es " + sum);

            System.out.println("Quieres realizar otra suma? true para SI o false para NO");
            otravez = scanner.nextBoolean();

        } while(otravez);

        scanner.close();
    }
}
