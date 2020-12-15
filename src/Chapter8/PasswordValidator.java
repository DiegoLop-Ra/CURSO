package Chapter8;

import java.util.Scanner;

public class PasswordValidator {
    private String username;
    private String currentPassword;

    private boolean valid;
    private String errorMessage;

    private static Scanner scanner = new Scanner(System.in);

    public PasswordValidator(String username, String currentPassword){
        this.username = username;
        this.currentPassword = currentPassword;
    }

    public boolean isValid(){
        return valid;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

    public void closeScanner(){
        scanner.close();
    }

    public static void main(String[] args){
        var validator = login();
        validator.printPasswordRules();

        do{
            var proposedPassword = validator.getProposedPassword();
            validator.changePassword(proposedPassword);

            if(!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }

        }while(!validator.isValid());

        System.out.println("La contraseña es valida");

        validator.closeScanner();
    }

    public static PasswordValidator login(){
        System.out.println("Ingresa tu usuario:");
        String username = scanner.nextLine();

        System.out.println("Ingresa tu contraseña:");
        String password = scanner.nextLine();

        return new PasswordValidator(username, password);
    }

    public void printPasswordRules(){
        System.out.println("Tu nueva contraseña debe cumplir las siguientes reglas:");
        System.out.println("* minimo de 8 caracteres");
        System.out.println("* contener una mayuscula");
        System.out.println("* contener un caracter especial");
        System.out.println("* no debe contener tu usuario");
        System.out.println("* no pude ser la misma contraseña");
        System.out.println();
    }

    public String getProposedPassword(){
        System.out.println("Ingresa tu nueva contraseña:");
        return scanner.nextLine();
    }

    public void changePassword(String newPassword){

        valid = true;
        errorMessage = "";

        if(newPassword.length() < 8){
            valid = false;
            errorMessage += "\n Tu contraseña debe contener al menos 8 caracteres.";
        }

        //Alternatively, can loop through string and use Character.isUpperCase on each char
        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Tu contraseña debe tener minimo una mayuscula.";
        }

        if(newPassword.matches("[a-zA-Z0-9 ]*")){
            valid = false;
            errorMessage += "\n Tu contraseña debe tener un caracter especial (e.j. %,$[:).";
        }

        if(newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;
            errorMessage += "\n Tu contraseña no puede contener tu usuario.";
        }

        if(newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Tu constraseña debe ser diferente al actual.";
        }
    }
}
