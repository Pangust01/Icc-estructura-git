package modelo;
import java.util.Arrays;

public class Busqueda {
    public int busquedaSecuencial(int[] arreglo, int dato) {
        for (int i = 0; i < arreglo.length; i++) {
            if (dato == arreglo[i]) {
                return i;
            }
        }
        return -1;
    }
    public int[] insertionSort(int[] numeros) {
        int tamanio = numeros.length;
        int[] arregloOrdenado = Arrays.copyOf(numeros, tamanio);
        //Bucle while dentro de un for para ordenar el arreglo
        for (int i = 1; i < tamanio; i++) {
            int elementoActual = arregloOrdenado[i];
            int j = i - 1;

            //Si "ascendente" es true asendente y si es false desendente
            while (j >= 0 && arregloOrdenado[j] > elementoActual) {//Compara valores y si es verdad se hara cambios

                arregloOrdenado[j + 1] = arregloOrdenado[j];
                j--;

            }

            arregloOrdenado[j + 1] = elementoActual;

            // Imprimir el estado del arreglo después de cada paso

        }

        return arregloOrdenado;//Retorna el arreglo ordenado
    }
    public int busquedaBinaria(int[] arreglo, int dato) {
            int bajo = 0;
            int tamanio=arreglo.length;
            int alto = arreglo.length - 1;
            System.out.println("Su arreglo es: "+imprimirArreglo(arreglo,tamanio,bajo)+"\nSu numero a encontrar es: "+dato);
            
            while (bajo <= alto) {
                
                System.out.println("");
                int central = (bajo + alto) / 2;
                
                System.out.println("El los datos son: "+"\nbajo="+bajo+"\nalto="+alto+"\nvalorCentral="+central);
                
                if (arreglo[central] == dato) {
                    return central; // Retorna el índice del dato encontrado
                } else if (arreglo[central] < dato) {
                    tamanio/=2;
                    bajo = central + 1;
                    System.out.println(imprimirArreglo(arreglo, tamanio,bajo));
                    System.out.println("--> Izquierda");
                } else {
                    alto = central - 1;
                    
                    System.out.println(imprimirArreglo(arreglo,bajo, alto));
                    System.out.println("--> Derecha");
                }
            }

            return -1; // Retorna -1 si el elemento no se encuentra en el arreglo
        }
    

    public String imprimirArreglo(int[] arreglo,int tamanio,int posicion){
        tamanio= arreglo.length;
        String salida="[";
        for (int i = posicion; i < tamanio; i++) {
            if (i<arreglo.length-1) {
                salida+= arreglo[i]+", ";
            } else {
                salida+= arreglo[i];
            }
        }
        return salida+"]";

    }
}