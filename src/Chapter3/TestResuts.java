package Chapter3;

import java.util.Scanner;
//IF ELSE IF
public class TestResuts {
    public static void main(String args[]){

        //Solicitar calificacion del examen o examenes
        System.out.println("Ingresa el puntaje de tu examen");
        Scanner scanner = new Scanner(System.in);
        double puntaje = scanner.nextDouble();

        //Determinar letras para la calificacion
        char calificacion;
        if(puntaje < 60){
            calificacion = 'F';
        }
        else if(puntaje < 70){
            calificacion = 'D';
        }
        else if(puntaje < 80){
            calificacion = 'C';
        }
        else if(puntaje < 90){
            calificacion = 'B';
        }
        else{
            calificacion = 'A';
        }
        System.out.println("Tu puntaje equivale a una " + calificacion);
    }
}
