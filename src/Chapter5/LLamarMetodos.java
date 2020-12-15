package Chapter5;


import java.util.Scanner;

public class LLamarMetodos {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);

        //Notify the user
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Ingresa tu salario:");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Ingresa tus puntos de credito:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Felicidades, tu solicitud fue aporvada.");
        }
        else{
            System.out.println("Lo siento, tu solicitud fue rechazada");
        }
    }
}
