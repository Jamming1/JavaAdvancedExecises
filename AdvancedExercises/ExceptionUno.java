package AdvancedExercises;

public class ExceptionUno {
    public static void main(String[] args){

        controllaNumero(15);
    }
    public static boolean controllaNumero(int number){
        if(number >= 0 || number <= 10){

            throw new ArithmeticException("il numero è compreso");

        } else {
            System.out.println("il numero non è compreso");
        }
        return true;

    }

}