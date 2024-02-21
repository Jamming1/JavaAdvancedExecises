package AdvancedExercises;
public class Nullability {

    public static void main(String[] args) {
        try {
            System.out.println(division(6, null));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Integer division(Integer x, Integer y) {
        if (x == null || y == null) {
            throw new IllegalArgumentException("Numeratore o denominatore non possono essere nulli");
        }
        return x / y;
    }
}