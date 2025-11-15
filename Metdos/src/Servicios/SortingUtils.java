package Servicios;

public final class SortingUtils {
    private SortingUtils(){}

    public static void imprimir(int[] a){
        for (int n : a) System.out.print(n + " ");
        System.out.println();
    }

    public static int[] copiar(int[] a){
        int[] copia = new int [a.length];
        System.arraycopy(a, 0, copia, 0, a.length);
        return copia;
    }

    public static int[] ejemplo(){
        return new int[]{5, 9, 2, 1, 3, 2, 4};
    }

    public static int[] ejmOrdenado() {
        return new int[] {1, 2 ,3 ,4, 5, 6};
    }

    public static int[] ejmInverso(){
        return new int[]{9, 8 ,7 ,6 ,5};
    }
}
