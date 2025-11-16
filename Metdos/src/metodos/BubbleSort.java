package metodos;

public class BubbleSort {
        public static void sort(int[] a) {
            //si el arrego esta vacio o solo tiene un valor
            //no hace nigun ordenamiento
            if (a == null || a.length <= 1) {
                return;
            }
            int n = a.length;
            boolean huboIntercambio;

            for (int i = 0; i < n - 1; i++) {
                huboIntercambio = false;
                for (int j = 0; j < n - i - 1; j++) {
                    //compara el elemento actual si es mayor al siguiente
                    if (a[j] > a[j + 1]) {
                        //realiza el orden cambaindo los elementos
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        huboIntercambio = true;
                    }
                }
                //si no hay cambios es porque ya esta ordenado
                if (!huboIntercambio) {
                    break;
                }
            }
        }

        public static void sort(int[] a, boolean trace) {
            if (!trace) {
                sort(a);
                return;
            }
            //si el arreglo esta vacio muestra:
            if (a == null || a.length <= 1) {
                System.out.println("Array ya ordenado o vacío");
                return;
            }

            //muestra como inicia
            System.out.println("bubble sort");
            System.out.println("Array inicial: " + arrayToString(a));

            int n = a.length;
            boolean huboIntercambio;
            int pasada = 0;

            for (int i = 0; i < n - 1; i++) {
                huboIntercambio = false;
                pasada++;

                for (int j = 0; j < n - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        huboIntercambio = true;
                    }
                }
                //va mostrando como esta haciendo el ordenamiento
                System.out.println("pasada " + pasada + ": " + arrayToString(a));
                if (!huboIntercambio) {
                    System.out.println("array ya ordenado");
                    break;
                }
            }

            System.out.println("array final: " + arrayToString(a));
        }

        private static String arrayToString(int[] a) {
            return java.util.Arrays.toString(a);
        }

    }