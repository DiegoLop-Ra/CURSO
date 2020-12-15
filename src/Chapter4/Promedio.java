package Chapter4;

import java.util.Scanner;
//Calculo del promedio de 24 estudiantes con 4 examenes cada uno
public class Promedio {
//Actualizacion
    public static void main(String args[]){

        //Variables
        int estudiantes = 24;
        int examenes = 4;

        Scanner scanner = new Scanner(System.in);

        //Ciclo
        for(int i=0; i< estudiantes; i++){

            double total = 0;
            for(int j=0; j<examenes; j++){
                System.out.println("Ingresa la calificacion del examen #" + (j+1));
                double calificacion = scanner.nextDouble();
                total = total + calificacion;
            }

            double prom = total/examenes;
            System.out.println("El promedio del estudiante #" + (i+1) + " es " + prom);
        }

        scanner.close();
    }
}
