package AdvancedExercises;
public class ExceptionTre {
    public static void main(String[] args) {

        //funzione try che prova la divisione
        try{
            int x = 9;
            int y = 0;
            int result = x/y;
            System.out.println("Risultato divisione: "+ result);

            //funzione che catch/cattura l'exception e genera un messaggio
        }catch(ArithmeticException e){
            System.out.println("Non è possibile dividere per 0 ");

            //funzione finally che viene eseguita a prescindere dall'exception
        }finally {
            System.out.println("Arrivederci");
        }
    }
}