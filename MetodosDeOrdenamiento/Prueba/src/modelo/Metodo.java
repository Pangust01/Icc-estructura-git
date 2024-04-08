package modelo;

public class Metodo {
    public int[] metodoSeleccion(int[] numero) {
        int tamanios = numero.length;
        for (int i = 0; i < tamanios - 1; i++) {
            // tenemos que encotrar el menor
            int index_menor = i;
            for (int j = i + 1; j < tamanios; j++) {
                if (numero[j] < numero[index_menor]) {
                    index_menor = j;
                }

            }
            // intercambiar el menor
            int aux = numero[index_menor];
            numero[index_menor] = numero[i];
            numero[i] = aux;
        }
        return numero;
    }

    public String ordenarSeleccion(int[] numero) {
        String salida = "";
        for (int i = 0; i < numero.length; i++) {
            if (i < numero.length - 1) {
                salida += numero[i] + "-";

            } else {
                salida += numero[i];
            }

        }
        return salida;

    }

    public static void main(String[] args) {
        Metodo metodosClase = new Metodo();
        int[] numero = { 1, 5, 6, 7, 8 };
        int[] ordenarSeleccion = metodosClase.metodoSeleccion(numero);
        System.out.println(metodosClase.ordenarSeleccion(ordenarSeleccion));
    }
}
