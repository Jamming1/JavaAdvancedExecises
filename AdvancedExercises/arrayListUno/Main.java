package AdvancedExercises.arrayListUno;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //nuovo arrayList di Student
        ArrayList<Student> classeA = new ArrayList<>();
        //"riempio" l'arrayList con gli studenti
        classeA.add(new Student("Luca",16));
        classeA.add(new Student("Anna",15));
        classeA.add(new Student("Mara",16));
        classeA.add(new Student("Carl",15));
        //ciclo for per stampare a video tutti gli studenti
        for(int i= 0;i<classeA.size();i++){
            System.out.println("Gli studenti di 1^ A sono: \n"+classeA.get(i));
        }
    }
}
