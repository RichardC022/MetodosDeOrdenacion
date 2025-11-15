package Servicios;

import metodos.SelectionSort;

public class SortingDemo {
    public static void main(String[] args) {
        demoSelectionSort();
    }

    public static void demoSelectionSort(){
        System.out.println("  Método SELECTION SORT  ");
        int[] datos = SortingUtils.ejmOrdenado();
        System.out.println("Ordenar: ");
        SortingUtils.imprimir(datos);

        SelectionSort.sort(datos, true);
        System.out.println("\nArreglo ordenado: ");
        SortingUtils.imprimir(datos);
        System.out.println();
    }
}
