package Servicios;

import metodos.InsertionSort;
import metodos.SelectionSort;
import metodos.BubbleSort;

public class SortingDemo {
    public static void main(String[] args) {
        // Datasets específicos del taller
        int[][] datasets = {
                {8, 3, 6, 3, 9},  // A
                {5, 4, 3, 2, 1},  // B
                {1, 2, 3, 4, 5},  // C
                {2, 2, 2, 2},     // D
                {9, 1, 8, 2},     // E
                {3},              //F
                {}                //G
        };

        System.out.println("Método Insertion sort");
        probarInsertionSort(datasets);

        System.out.println("\nMétodo Selection sort");
        probarSelectionSort(datasets);

        System.out.println("\nMétodo Bubble sort");
        probarBubbleSort(datasets);

        System.out.println("\nComparación de los resultados");
        compararResultados(datasets);
    }

    public static void probarInsertionSort(int[][] datasets) {
        for (int i = 0; i < datasets.length; i++) {
            int[] copia = SortingUtils.copiarArray(datasets[i]);
            System.out.println("\nDataset " + (char)('A' + i) + ":");
            SortingUtils.imprimir("Array original: ", datasets[i]);
            InsertionSort.sort(copia, true);
        }
    }

    public static void probarSelectionSort(int[][] datasets) {
        for (int i = 0; i < datasets.length; i++) {
            int[] copia = SortingUtils.copiarArray(datasets[i]);
            System.out.println("\nDataset " + (char)('A' + i) + ":");
            SortingUtils.imprimir("Array original: ", datasets[i]);
            SelectionSort.sort(copia, true);
        }
    }

    public static void probarBubbleSort(int[][] datasets) {
        for (int i = 0; i < datasets.length; i++) {
            int[] copia = SortingUtils.copiarArray(datasets[i]);
            System.out.println("\nDataset " + (char)('A' + i) + ":");
            SortingUtils.imprimir("Array original: ", datasets[i]);
            BubbleSort.sort(copia, true);
        }
    }

    public static void compararResultados(int[][] datasets) {
        for (int i = 0; i < datasets.length; i++) {
            int[] copiaInsertion = SortingUtils.copiarArray(datasets[i]);
            int[] copiaBubble = SortingUtils.copiarArray(datasets[i]);
            int[] copiaSelection = SortingUtils.copiarArray(datasets[i]);

            InsertionSort.sort(copiaInsertion);
            SelectionSort.sort(copiaSelection);
            BubbleSort.sort(copiaBubble);

            System.out.println("\nDataset " + (char)('A' + i) + ":");
            SortingUtils.imprimir("Original:  ", datasets[i]);
            SortingUtils.imprimir("Insertion: ", copiaInsertion);
            SortingUtils.imprimir("Selection: ", copiaSelection);
            SortingUtils.imprimir("Bubble:    ", copiaBubble);

            boolean todosIguales = SortingUtils.sonIguales(copiaInsertion, copiaBubble) &&
                    SortingUtils.sonIguales(copiaBubble, copiaSelection);

            boolean correctamenteOrdenado = SortingUtils.estaOrdenado(copiaInsertion);

            if (todosIguales && correctamenteOrdenado) {
                System.out.println("Todos son iguales y están ordenados");
            } else {
                System.out.println("Algo salió mal");
            }
        }
    }
}
