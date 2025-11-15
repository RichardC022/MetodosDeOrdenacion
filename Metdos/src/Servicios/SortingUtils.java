package Servicios;

public final class SortingUtils {

        public static int[] ejmOrdenado() {
            return new int[]{1, 2, 3, 4, 5};
        }

        public static int[] ejmInverso() {
            return new int[]{5, 4, 3, 2, 1};
        }

        public static int[] ejmDesordenado() {
            return new int[]{8, 3, 6, 3, 9};
        }

        public static int[] ejmDuplicados() {
            return new int[]{2, 2, 2, 2};
        }

        public static int[] ejmMixto() {
            return new int[]{9, 1, 8, 2};
        }

        public static void imprimir(int[] array) {
            if (array == null) {
                System.out.println("null");
                return;
            }
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        public static void imprimir(String mensaje, int[] array) {
            System.out.print(mensaje);
            imprimir(array);
        }

        public static int[] copiarArray(int[] original) {
            if (original == null) return null;
            int[] copia = new int[original.length];
            for (int i = 0; i < original.length; i++) {
                copia[i] = original[i];
            }
            return copia;
        }

        public static boolean estaOrdenado(int[] array) {
            if (array == null || array.length <= 1) return true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
            return true;
        }

        public static boolean sonIguales(int[] a, int[] b) {
            if (a == null && b == null) return true;
            if (a == null || b == null) return false;
            if (a.length != b.length) return false;

            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) return false;
            }
            return true;
        }
    }

