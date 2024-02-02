package AdvancedExercises;
import java.util.HashSet;
public class HashSetDue {
    public static void main(String[] args) {
        //oggetto dello stesso tipo aggiunto all'HashSet
        String element = "quarto elemento";

        HashSet<String> elements = stringaElementi();
        elements.add(element);

        System.out.println("gli elementi dell'HashSet sono" + elements);

        //if statement che controlla se l'elemento è contenuto e stampa l'outcome
        if(elements.contains(element)){
            System.out.println("L'elemento " + element +" è contenuto");
        }
    }
    //metodo che riempie l'HashSet
    public static HashSet<String> stringaElementi() {
        HashSet<String> elements = new HashSet<String>();
        elements.add("primo elemento");
        elements.add("secondo elemento");
        elements.add("terzo elemento");

        return elements;
    }

}
//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato