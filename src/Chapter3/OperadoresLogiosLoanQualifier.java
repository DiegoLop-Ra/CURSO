package Chapter3;

import java.util.Scanner;

/*
* Operadores Logicos
* Para aceptar un prestamo, la persona debe ganar al menos 30000 pesos
* Tener una antiguedad de 2 años en su trabajo
* Capitulo 3 IF anidados
*/
public class OperadoresLogiosLoanQualifier {

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
        if (salario >= SalarioMin && Tiempo >= TiempoMin) {
                System.out.println("Felicidades!! tu prestamo fue aprobado");
        }
        else {
            System.out.println("Lo sentimos, no cumples con los requisitos minimos");
        }
    }

}