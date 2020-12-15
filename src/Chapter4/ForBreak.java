package Chapter4;

//For uso de break

import java.util.Scanner;

public class ForBreak {

    public static void main(String args[]){

        //Ingresar texto
        System.out.println("Ingresa algun texto:");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.next();
        scanner.close();

        boolean letraA = false;

        //Buscando la letra A
        for(int i=0; i<texto.length(); i++){
            char letraactual = texto.charAt(i);
            if(letraactual == 'A' || letraactual == 'a'){
                letraA = true;
                break;
            }
        }

        if(letraA){
            System.out.println("Este texto contiene la letra 'A'");
        }
        else{
            System.out.println("Este texto no contiene la letra 'A'");
        }
    }
}
