package AdvancedExercises;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetTre {
    public static void main(String[] args) {

        String element = "quarto elemento";

        HashSet<String> elements = stringaElementi();
        Iterator<String> iterator = elements.iterator();
        // Rimuove l'elemento utilizzando il metodo remove dell'iteratore
        while(iterator.hasNext()){
            String data = iterator.next();
            System.out.println(data);
            if(data.equals(element)){
                iterator.remove();
            }
        }

    }
    public static HashSet<String> stringaElementi() {
        HashSet<String> elements = new HashSet<>();
        elements.add("primo elemento");
        elements.add("secondo elemento");
        elements.add("terzo elemento");

        return elements;
    }
}
