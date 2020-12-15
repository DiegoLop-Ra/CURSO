package Chapter3;

import java.util.Scanner;
//Actualizacion
public class EjercicioCapitulo3 {
    public static void main(String args[]){
        //Variables
        double cincocen = .05;
        double diezcen = .10;
        double cincuantacen =.50;
        int peso = 1;

        System.out.println("Ingresa los valores necesarios para completar 1 peso!");

        //Captura de valores
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas monedas de 5 centavos quieres?");
        int numcincocen = scanner.nextInt();
        System.out.println("Cuantas monedas de 10 centavos quieres?");
        int numdiezcen = scanner.nextInt();
        System.out.println("Cuantas monedas de 50 centavos quieres?");
        int numcincen = scanner.nextInt();

        scanner.close();

        //Calculo
        double total = numcincocen * cincocen + numdiezcen * diezcen + numcincen * cincuantacen;

        //Resultado
        if(total < peso){
            System.out.println("Lo sentimos, te faltan centavos para completar 1 peso");
        }
        else if(total > peso){
            System.out.println("Lo sentimos, sobrepasaste el valor de 1 peso");
        }
        else{
            System.out.println("Excelente!! completaste 1 peso exacto");
        }
    }
}
