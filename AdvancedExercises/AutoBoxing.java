package AdvancedExercises;

public class AutoBoxing {
    public static void main(String[] args) {
     //Usare le funzioni scritte con i valori creati
        sum(9,8);
        character('c');
        myInteger(7, 9);
        myCharacter('a');

    }
    //Scrivere una funzione che accetti in input 2 int e ne stampi la somma
    private static void sum(int x, int y){
        System.out.println(x+y);
    }
    //Scrivere una funzione che accetti in input 1 char lo stampi
    private static void character(char c){
        System.out.println(c);;
    }
    //Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
    private static void myInteger(Integer z, Integer w){
        System.out.println(z+w);
    }
    //Scrivere una funzione che accetti in input 1 Character lo stampi
    private static void myCharacter(Character a){
        System.out.println(a);
    }
    //Scrivere un un valore primitivo per int, double e char e fare autoboxing
    int x = Integer.valueOf(7);
    double y = Double.valueOf(6.8);
    char b = Character.valueOf('b');
    //Scrivere un oggetto per Integer, Double e Character e fare Unboxing
    Integer xx = Integer.valueOf(x);
    Double yy = Double.valueOf(y);
    Character bb = Character.valueOf(b);
}






