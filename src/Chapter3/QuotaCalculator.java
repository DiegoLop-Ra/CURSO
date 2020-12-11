package Chapter3;

/*
 * IF ELSE
 * Se espera que los empleados tengan mas de 10 ventas por semana
 * Para quien lo logra recibe un mensaje de felicitacion
 * Para quien no lo logra se le avisa cuantas ventas le faltaron
 */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]) {

        //Valores que tenemos
        int meta = 10;

        //Solicitar datos
        System.out.println("Ingresa tus ventas de esta semana:");
        Scanner scanner = new Scanner(System.in);
        int ventas = scanner.nextInt();
        scanner.close();

        //Toma de decision
        if(ventas >= meta){
            System.out.print("Felicidades, lograste llegar a tu meta!!");
                    }
        else {
            int faltantes = meta - ventas;
            System.out.print("No lograste alcanzar la meta. Te faltaron " + faltantes + " ventas");
        }

    }
}
