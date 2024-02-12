package AdvancedExercises.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Creare un LinkedList con elementi e stamparlo in console.
        LinkedList<Fruit> fruitList = new LinkedList<>();
        fruitList.add(new Fruit("Maracuja"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Apple"));
        fruitList.add(new Fruit("Orange"));
        System.out.println("My list of fruits contains: " + fruitList);

        //Aggiungere un elemento al primo posto della lista
        fruitList.addFirst(new Fruit("Mango"));
        //Stampare la collezione aggiornata
        System.out.println("Updated fruit list, added element at the first place: " + fruitList);
        //Aggiungere un elemento all'ultimo posto della lista
        fruitList.addLast(new Fruit("Grape"));
        //Stampare la collezione aggiornata
        System.out.println("Updated fruit list, added element at the first and at the last place: " + fruitList);
    }
}



