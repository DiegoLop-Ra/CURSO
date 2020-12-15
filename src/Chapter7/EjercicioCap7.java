package Chapter7;

import java.util.Scanner;

public class EjercicioCap7 {

    public static void main(String args[]){
        String[] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un numero del 1 al 7");
        int index = input.nextInt();
        input.close();

        System.out.println("Ese numero corresponde al dia: " + semana[index - 1]);
    }
}
