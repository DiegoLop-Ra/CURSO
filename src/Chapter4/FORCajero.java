package Chapter4;

import java.util.Scanner;

public class FORCajero {

    public static void main(String args[]){

        //Numero de objetos
        System.out.println("Ingresa el numero de objetos que quieres escanear:");
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();

        double total = 0;

        //Crear contador con numero de repeticiones
        for(int i=0; i<cantidad; i++){

            System.out.println("Ingresa el costo del producto:");
            double precio = scanner.nextDouble();

            total = total + precio;
        }

        scanner.close();

        System.out.println("El total es de " + total);
    }
}
