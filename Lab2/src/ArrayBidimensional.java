public class ArrayBidimensional {
    public static void main(String[] args) {
        // Declarație și inițializare
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Parcurgere și afișare cu bucle for imbricate
        System.out.println("Parcurgere și afișare cu bucle for imbricate:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Afișare întregului array într-un format de matrice
        System.out.println("Afișare întregului array într-un format de matrice:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}