import java.util.Arrays;

public class ArrayUnidimensional {
    public static void main(String[] args) {
        // Declarație și inițializare
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Parcurgere și afișare cu buclă for clasică
        System.out.println("Parcurgere cu buclă for clasică:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Parcurgere și afișare cu buclă "enhanced for"
        System.out.println("Parcurgere cu buclă 'enhanced for':");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Afișare întregului array într-o singură linie
        System.out.println("Afișare întregului array:");
        System.out.println(Arrays.toString(array));
    }
}