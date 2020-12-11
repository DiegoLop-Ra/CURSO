package Chapter3;

import java.util.Scanner;

/*
* IF anidados
* Para aceptar un prestamo, la persona debe ganar al menos 30000 pesos
* Tener una antiguedad de 2 años en su trabajo
*/
public class LoanQualifier {

    public static void main(String args[]) {

        //Datos conocidos
        int SalarioMin = 30000;
        int TiempoMin = 2;

        //Obtener infomacion
        System.out.println("Ingresa tu salario:");
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();

        System.out.println("Ingresa los años laborados en tu actual trabajo:");
        double Tiempo = scanner.nextDouble();
        scanner.close();

        //Tomar decision
        if (salario >= SalarioMin) {
            if (Tiempo >= TiempoMin) {
                System.out.println("Felicidades!! tu prestamo fue aprobado");
            } else {
                System.out.println("Lo sentimos, debes tener " + TiempoMin + " años o mas en tu trabajo actual");
            }
        } else {
            System.out.println("Lo sentimos tu debes ganar al menos " + SalarioMin + " en tu trabajo actual");
        }
    }

}