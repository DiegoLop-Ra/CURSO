package Chapter3;

/* If Statement.
el personal recibe un pago de 1000 pesos semanales.
el personal que exceda 10 ventas obtiene un adicional de 250 pesos.
*/

import java.util.Scanner;

public class SalaryCalculator {
    public static void main (String args[]) {

        //infromacion que tenemos
        int salario = 1000;
        int bonus = 250;
        int meta = 10;

        //Informacion que necesitamos
        System.out.println("Cuantas ventas tiene el empelado esta semana?");
        Scanner scanner = new Scanner(System.in);
        int ventas = scanner.nextInt();
        scanner.close();

        //Quien gana Bono?
        if (ventas > meta){
            salario = salario + bonus;
        }

        //Mostrar resultado
        System.out.println("Tu salario es de " + salario + " pesos");


    }
}
