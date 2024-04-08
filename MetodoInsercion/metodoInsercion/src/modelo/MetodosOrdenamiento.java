package modelo;
public class MetodosOrdenamiento {
    public void insertionSort(int[] numeros){
        //insertion -> insercion
        // sort -> ordenar
        int tamanio=numeros.length;
        for (int i = 1; i < tamanio; i++) {
            //El elemento a comparar
            int elem= numeros[i];
            int j=i-1;
            while (j>=0 && numeros[j]>elem) {
                numeros[j+1] = numeros[j];
                j--;
            }
            numeros[j+1] = elem;
        }
        imprimirArreglo(numeros);
    }   
    // Metodo para imprimir un arreglo de Int[]
    public void imprimirArreglo(int[] numeros){
        String salida="[";
        for (int i = 0; i < numeros.length; i++) {
            if (i<numeros.length-1) {
                salida+=numeros[i]+", ";
            } else {
                salida+=numeros[i];
            }
        }
                
        System.out.println("Su arreglo es: "+salida+"]");
    }
}
