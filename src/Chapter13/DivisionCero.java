package Chapter13;

public class DivisionCero {

    public static void main(String[] args){

        try{
            int c = 30/0;
        }catch(ArithmeticException e){
            System.out.println("La division entre cero no esta permitida");
        }finally{
            System.out.println("Dividir es divertido!");
        }
    }
}
