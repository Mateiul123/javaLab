public class ArrayTridimensional {
    public static void main(String[] args) {
        // Declarație și inițializare
        int[][][] array = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                }
        };

        // Parcurgere și afișare cu bucle for imbricate
        System.out.println("Parcurgere și afișare cu bucle for imbricate:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Afișare întregului array într-un format structurat
        System.out.println("Afișare întregului array într-un format structurat:");
        for (int[][] matrix : array) {
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}