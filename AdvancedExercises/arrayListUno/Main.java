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
        // stampare a video tutti gli studenti
        System.out.println("Gli studenti della Classe A sono: " + classeA);

        }
    }
