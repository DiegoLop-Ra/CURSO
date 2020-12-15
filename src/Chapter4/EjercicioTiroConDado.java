package Chapter4;


//Objetivo: Llegar a la meta del tablero compuesto por 20 espacios, solo con 5 tiros de un dado
//Si se agotan los 5 tiros y no se llega a la meta el jugador pierde
//Si el jugador supera los 20 espacions pierde
//Se le debe informar al jugador en que espacio esta y cuantos le faltan
//Si el jugador llega a el espacio 20 antes de sus cinco tiros gana

import java.util.Random;

public class EjercicioTiroConDado {
    public static void main(String args[]) {

        System.out.println("Bienvenido: Tienes 5 tiros de un dado para recorrer 20 espacios, SUERTE!!");

        //Variables
        int tiros = 5;
        int casillaactual = 0;
        int ultimacasilla = 20;
        Random random = new Random();

        for (int i = 1; i <= tiros; i++) {

            int dado = random.nextInt(6) + 1;
            casillaactual = casillaactual + dado;

            System.out.print(String.format("Tiro #%d: Sacaste un %d. ", i, dado));


            if (casillaactual == ultimacasilla) {
                System.out.print("Estas en la casilla " + casillaactual + ". Felicidades! Haz ganado!");
                break;
            } else if (casillaactual > ultimacasilla) {
                System.out.print("Haz superado " + ultimacasilla + " casillas. Perdiste!");
                break;
            } else if (i == tiros && casillaactual < ultimacasilla) {
                System.out.println("Estas en la casilla " + casillaactual + ".");
                System.out.println("Ya no te quedan mas tiros para llegar a " +
                        ultimacasilla + ". Perdiste!");
            } else {
                int porllegar = ultimacasilla - casillaactual;
                System.out.print("Ahora estas en la casilla " + casillaactual +
                        " te quedan " + porllegar + " por avanzar.");
            }

            System.out.println();
        }
    }

}
