package metodos;

import java.util.Arrays;

public class InsertionSort {
        public static void sort(int[] a) {
            if (a == null || a.length <= 1) {
                return;
            }
            for (int i = 1; i < a.length; i++) {
                int valorActual = a[i];
                int posicion = i - 1;

                while (posicion >= 0 && a[posicion] > valorActual) {
                    a[posicion + 1] = a[posicion];
                    posicion--;
                }

                a[posicion + 1] = valorActual;
            }
        }
        public static void sort(int[] a, boolean trace) {
            if (!trace) {
                sort(a);
                return;
            }

            if (a == null || a.length <= 1) {
                System.out.println("Array ya ordenado o vacío");
                return;
            }

            System.out.println("insertion sort");
            System.out.println("Array inicial: " + arrayToString(a));

            for (int i = 1; i < a.length; i++) {
                int valorActual = a[i];
                int posicion = i - 1;

                System.out.println("iteración " + i + ": insertando " + valorActual);

                while (posicion >= 0 && a[posicion] > valorActual) {
                    a[posicion + 1] = a[posicion];
                    posicion--;
                }

                a[posicion + 1] = valorActual;
                System.out.println("luego de insertar: " + arrayToString(a));
            }

            System.out.println("Array final: " + arrayToString(a));
        }

        // para mostrar el arreglo de mejor forma
        private static String arrayToString(int[] a) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < a.length; i++) {
                sb.append(a[i]);
                if (i < a.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }