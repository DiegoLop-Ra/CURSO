package Chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main (String agrs[]){

        System.out.println("Ingresa la letra de tu calificacion (A,B,C,D,F):");
        Scanner scanner = new Scanner(System.in);
        String letra = scanner.next();

        String mensaje;

        switch(letra){
            case "A":
                mensaje = "Excelente trabajo!";
                break;
            case "B":
                mensaje = "Buen trabajo!, aun puedes mejorar";
                break;
            case "C":
                mensaje = "Nada Mal!, continua estudiando";
                break;
            case "D":
                mensaje = "Por poco!, necesitas esforzarte mas!";
                break;
            case "F":
                mensaje = "La dedicacion y constancia son los mejores consejos, lo lograras a la proxima vez";
                break;
            default:
                mensaje = "Favor de ingresar una letra valida";
                break;
        }
        System.out.println(mensaje);

    }
}
