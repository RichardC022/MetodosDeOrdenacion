package metodos;

public class BubbleSort {
        public static void sort(int[] a) {
            if (a == null || a.length <= 1) {
                return;
            }
            int n = a.length;
            boolean huboIntercambio;

            for (int i = 0; i < n - 1; i++) {
                huboIntercambio = false;

                for (int j = 0; j < n - i - 1; j++) {

                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        huboIntercambio = true;
                    }
                }

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

            if (a == null || a.length <= 1) {
                System.out.println("Array ya ordenado o vacío");
                return;
            }


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

                System.out.println("pasada " + pasada + ": " + arrayToString(a));
                if (!huboIntercambio) {
                    System.out.println("array ya ordenado");
                    break;
                }
            }

            System.out.println("array final: " + arrayToString(a));
        }

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