package metodos;

public final class SelectionSort {
    public static void sort(int[] a) {
        sort(a, false);
    }
    public static void sort(int[] a, boolean trace) {
        int n = a.length; // Tamaño del arreglo
        int swaps = 0; // Contador

        for (int i = 0; i < n - 1; i++) {
            int minimo = i; // Toma al valor en i como minimo

            // Busca el valor minimo
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minimo]) {
                    minimo = j; //Nuevo minimo
                }
            }
            //Compara y reorganiza
            if (minimo != i) {
                 int temp = a[i];
                 a[i] = a[minimo];
                 a[minimo] = temp;
                  swaps++;
            }

             if (trace) {
            System.out.println("\nIteración #" + (i+1) );
            imprime(a);
            }
        }

        if(trace){
             System.out.println("\nTotal Swaps: " + swaps);
        }
    }
    private static void imprime(int[] a) {
        for(int n : a) System.out.print(n + " ");
        System.out.println();
    }
}
