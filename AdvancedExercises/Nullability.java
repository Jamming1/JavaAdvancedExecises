package AdvancedExercises;
public class Nullability {

    public static void main(String[] args) {
        System.out.println(division(6,null));
    }
    private static boolean division(Integer x, Integer y){
        try {
            int result = x / y;
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Attenzione: la variabile ha valore nullo!");
        }
        return false;
    }
}
