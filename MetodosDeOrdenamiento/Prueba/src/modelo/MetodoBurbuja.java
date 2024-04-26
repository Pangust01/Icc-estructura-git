package modelo;

public class MetodoBurbuja {

    public void metodoBurbujaDesendente(int[] arreglo) {
        // int[] numeros = { 97, 50, 25, 5, 10, 0 };
        int tamanio = arreglo.length;
        int aux = 0;
        for (int i = 0; i < tamanio - 2; i++) {
            for (int j = i + 1; j < tamanio - 1; j++) {
                if (arreglo[i] < arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;

                }
            }
        }
        for (int i : arreglo) {
            System.out.print(i + " ");

        }

    }
    // System.out.print(i);
    // if (i < tamanio- 1) {
    // System.out.print(",");
    // }

    public static void main(String[] args) {
        int[] numeros = { 97, 50, 25, 5, 10, 0 };
        MetodoBurbuja m1 = new MetodoBurbuja();
        m1.metodoBurbujaDesendente(numeros);
    }
}
