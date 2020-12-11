package Chapter2;

import java.util.Scanner;

public class MadLips {

    public static void main(String arg[]){

        System.out.println("Cual es tu estacion favorita del año?.");
        Scanner scanner = new Scanner(System.in);
        String estacion = scanner.nextLine();

        System.out.println("Ingresa un adjetivo.");
        String adjetivo = scanner.nextLine();

        System.out.println("Cual es tu numero favorito?.");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println("En un " + adjetivo + " " + estacion + " yo bebi " + numero + " tazas de cafe");

    }


}
