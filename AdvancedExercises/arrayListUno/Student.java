package AdvancedExercises.arrayListUno;

import java.util.ArrayList;

public class Student {
String nome;
int eta;
    //metodo costruttore
    public Student(String nome, int eta){
    this.nome = nome;
    this.eta = eta;
 }
    //override
    @Override
    public String toString() {
        return "Studente nome e età:\n" +
                 nome +
                ", " + eta;
    }
}
//Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console


