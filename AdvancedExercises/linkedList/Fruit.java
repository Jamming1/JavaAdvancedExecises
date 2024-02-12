package AdvancedExercises.linkedList;

//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
public class Fruit {
    String name;

    public Fruit(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit name: " +  name;

    }
}
