package eserciziJava.esercizioCostruttore.java;

public class Main {
    public static void main(String[] args) {
        Studente student1 = new Studente("Anna","Maggio","AZ94R6");
        System.out.println(student1);
        
        //uso getter e setter per inserire nuovi dati studente
        System.out.println(student1.getFirstName());
        student1.setFirstName("Mara");

        System.out.println(student1.getFirstName());
    }
}
