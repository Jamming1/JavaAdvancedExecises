package AdvancedExercises;
public class ExceptionQuattro {
    public static void main(String[] args) {

        //funzione try che prova la divisione sull'array

        try{
            int[] x = {9,6,9,12};
            int y = 0;
            int result = x[8]/y;

            System.out.println("Risultato divisione: "+ result);

            //funzione che catch/cattura l'exception della divisione e genera un messaggio
        }catch(ArithmeticException e) {
            System.out.println("Non è possibile dividere per 0 ");

            //funzione che cattura l'exception dell' indice e genera un messaggio
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("L'indice non è presente");

            //funzione finally che viene eseguita a prescindere dall'exception
        }finally {
            System.out.println("Arrivederci");
        }
    }
}
