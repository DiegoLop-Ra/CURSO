package Chapter2;

import java.util.Scanner;
//Ejercicio 1
public class GrossPayCalculator {
    public static void main(String arg[]){

        System.out.println("Enter the number of hours the employee worked."); //Etiqueta solicitando las horas laboradas
        Scanner scanner = new Scanner(System.in); //Ingresar numero de horas laboradas
        int hours = scanner.nextInt();

        System.out.println("Enter the employee's pay rate."); //Etiqueta que solicita cuanto se paga la hora
        double rate = scanner.nextDouble(); //Ingresar monto pagado por hora
        scanner.close();

        double grossPay = hours * rate; //Multiplicar horas por monto

        System.out.println("The employee's gross pay is $" + grossPay); //Mostrar el resultado

    }

}
