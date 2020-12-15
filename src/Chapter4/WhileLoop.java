package Chapter4;

import java.util.Scanner;

public class WhileLoop {
//Actualizacion
    public static void main(String args[]){

        //Variables
        int pago = 25;
        int maxHoras = 40;


        //Solicitar valores
        System.out.println("Cuantas horas trabajaste esta semana?");
        Scanner scanner = new Scanner(System.in);
        double trabajo = scanner.nextDouble();

        //Validar entradas
        while(trabajo > maxHoras || trabajo < 1){
            System.out.println("Por favor ingresa un valor entre 1 y 40 hrs");
            trabajo = scanner.nextDouble();
        }

        scanner.close();

        //Calculo
        double salario = pago * trabajo;
        System.out.println("Tu salario es de " + salario + " Pesos");



    }

}
