package AdvancedExercises.arrayListUno;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> classeA = new ArrayList<>();

        classeA.add(new Student("Luca",16));
        classeA.add(new Student("Anna",15));
        classeA.add(new Student("Mara",16));
        classeA.add(new Student("Carl",15));

        for(int i= 0;i<classeA.size();i++){
            System.out.println(classeA.get(i));
        }
    }
}
