package Servicios;

import metodos.InsertionSort;
import metodos.SelectionSort;
import metodos.BubbleSort;

import java.util.Arrays;

public class SortingDemo {
        public static void main(String[] args) {
            // Datasets específicos del taller
            int[][] datasets = {
                    {8, 3, 6, 3, 9},  // A
                    {5, 4, 3, 2, 1},  // B
                    {1, 2, 3, 4, 5},  // C
                    {2, 2, 2, 2},     // D
                    {9, 1, 8, 2}      // E
            };

            System.out.println("=== metodo insertion sort ===");
            probarInsertionSort(datasets);

            System.out.println("\n=== metodo bubble sort ===");
            probarBubbleSort(datasets);

            System.out.println("\n=== metodo selection sort ===");
            probarSelectionSort(datasets);

            System.out.println("\n=== comparacion de los resultados ===");
            compararResultados(datasets);
        }

        public static void probarInsertionSort(int[][] datasets) {
            for (int i = 0; i < datasets.length; i++) {
                int[] copia = SortingUtils.copiarArray(datasets[i]);
                System.out.println("\nDataset " + (char)('A' + i) + ":");
                SortingUtils.imprimir("Original: ", datasets[i]);
                InsertionSort.sort(copia, true);
            }
        }

        public static void probarBubbleSort(int[][] datasets) {
            for (int i = 0; i < datasets.length; i++) {
                int[] copia = SortingUtils.copiarArray(datasets[i]);
                System.out.println("\nDataset " + (char)('A' + i) + ":");
                SortingUtils.imprimir("Original: ", datasets[i]);
                BubbleSort.sort(copia, true);
            }
        }

        public static void probarSelectionSort(int[][] datasets) {
            for (int i = 0; i < datasets.length; i++) {
                int[] copia = SortingUtils.copiarArray(datasets[i]);
                System.out.println("\nDataset " + (char)('A' + i) + ":");
                SortingUtils.imprimir("Original: ", datasets[i]);
                SelectionSort.sort(copia, true);
            }
        }

        public static void compararResultados(int[][] datasets) {
            for (int i = 0; i < datasets.length; i++) {
                int[] copiaInsertion = SortingUtils.copiarArray(datasets[i]);
                int[] copiaBubble = SortingUtils.copiarArray(datasets[i]);
                int[] copiaSelection = SortingUtils.copiarArray(datasets[i]);

                InsertionSort.sort(copiaInsertion);
                BubbleSort.sort(copiaBubble);
                SelectionSort.sort(copiaSelection);

                System.out.println("\nDataset " + (char)('A' + i) + ":");
                SortingUtils.imprimir("original:  ", datasets[i]);
                SortingUtils.imprimir("insertion: ", copiaInsertion);
                SortingUtils.imprimir("bubble:    ", copiaBubble);
                SortingUtils.imprimir("selection: ", copiaSelection);

                boolean todosIguales = SortingUtils.sonIguales(copiaInsertion, copiaBubble) &&
                        SortingUtils.sonIguales(copiaBubble, copiaSelection);

                boolean correctamenteOrdenado = SortingUtils.estaOrdenado(copiaInsertion);

                if (todosIguales && correctamenteOrdenado) {
                    System.out.println("todos son iguales y estan ordenados");
                } else {
                    System.out.println("algo salio mal");
                }
            }
        }
    }
