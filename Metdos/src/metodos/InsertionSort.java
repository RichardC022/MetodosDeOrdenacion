package metodos;

import java.util.Arrays;

public final class  InsertionSort {
        public static void sort(int[] a) {
            //si el arrego esta vacio o solo tiene un valor
            //no hace nigun ordenamiento
            if (a == null || a.length <= 1) {
                return;
            }

            for (int i = 1; i < a.length; i++) {
                //guarda el valor que se va a insertar
                int valorActual = a[i];
                //empezamos a comparar hacia atrás
                int posicion = i - 1;

                //va moviendo los valores mayores hacia la derecha
                while (posicion >= 0 && a[posicion] > valorActual) {
                    a[posicion + 1] = a[posicion];
                    posicion--;
                }
                //inserta el valor en la posicion correcta
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

            int swaps = 0;

            for (int i = 1; i < a.length; i++) {
                int valorActual = a[i];
                int posicion = i - 1;

                System.out.println("Iteración " + i + ": Insertando " + valorActual);

                while (posicion >= 0 && a[posicion] > valorActual) {
                    a[posicion + 1] = a[posicion];
                    posicion--;
                    swaps++;
                }

                a[posicion + 1] = valorActual;
                System.out.println("Salida: " + arrayToString(a));
            }

            System.out.println("Array final: " + arrayToString(a));
            //presentar swaps
            System.out.println("Total swaps: " + swaps);
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