package AdvancedExercises.arrayListDue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creare un ArrayList con 12 elementi e stamparlo in console.
        List<Student> classeA = new ArrayList<Student>();
        classeA.add(new Student("Luca ",12));
        classeA.add(new Student("Anna ",11));
        classeA.add(new Student("Maria ",10));
        classeA.add(new Student("Mara ",11));
        classeA.add(new Student("Marco ",12));
        classeA.add(new Student("Flavio ",10));
        classeA.add(new Student("Mattia ",11));
        classeA.add(new Student("Carla ",12));
        classeA.add(new Student("Fatima ",11));
        classeA.add(new Student("Nina ",10));
        classeA.add(new Student("Stefano ",9));
        classeA.add(new Student("Giada ",13));
        System.out.println("Lista studenti Classe A: " + classeA);

        //Mettere in ordine alfabetico la collezione e stampare il risultato
        classeA.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println("Lista studenti in ordine alfabetico: " + classeA);

        //Mettere in ordine numerico la collezione e stampare il risultato
        classeA.sort(Comparator.comparing(Student :: getAge));
        System.out.println("Lista studenti in ordine di età: " + classeA);

    }
}
