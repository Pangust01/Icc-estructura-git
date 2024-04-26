package modelo;

public class MetodosOrdenamiento {
    public int[] sortBubble(int[] arreglo, boolean verPaso, boolean ascendente) {
        int tamanio = arreglo.length;

        if (verPaso) {
            System.out.println("Iniciando ordenamiento burbuja...");
        }

        for (int i = 0; i < tamanio; i++) {
            if (verPaso) {
                System.out.println("\nPaso número " + (i + 1));
            }
            for (int j = i + 1; j < tamanio; j++) {
                if (verPaso) {
                    System.out.println("Comparando elementos: i= " + arreglo[i] + ", j =" + arreglo[j]);
                }
                // si es true asendente y si es false desendente
                if (ascendente ? arreglo[i] > arreglo[j] : arreglo[i] < arreglo[j]) {
                    if (verPaso) {
                        System.out.println("Intercambiando elementos...");
                    }
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
        System.out.println("");

        return arreglo;
    }

    public int[] insertionSort(int[] numeros, boolean verPaso, boolean ascendente) {
        int tamanio = numeros.length;

        if (verPaso) {
            System.out.println("Iniciando ordenamiento por inserción...");
        }
        

        for (int i = 1; i < tamanio; i++) {
            int elementoActual = numeros[i];
            int j = i - 1;
            if (verPaso) {
                System.out.println("\nIteración " + i + ":");
                System.out.println("Elemento inicial: " + numeros[j]);
                System.out.println("Comparando para saber si hay cambio...");
            }

            while (j >= 0 && (ascendente ? numeros[j] > elementoActual : numeros[j] < elementoActual)) {
                
                if (verPaso) {    
                    System.out.println("Se encontro un numero a comparar");
                    System.out.println("Se cambio de posicion el numero "+numeros[j]+" a la posicion ["+(j+1)+"]");
                }
                numeros[j + 1] = numeros[j];
                j--;

            }

            numeros[j + 1] = elementoActual;

            // Imprimir el estado del arreglo después de cada paso
            if (verPaso) {
                System.out.print("Estado actual del arreglo: ");
                imprime(numeros);
            }
        }
        if (verPaso) {
            System.out.println("Ordenamiento por inserción completado.");
        }
        
        return numeros;
    }

    public int[] metodoSeleccion(int[] numeros, boolean verPaso, boolean ascendente) {
        int tamanio = numeros.length;
        System.out.println("Iniciando ordenamiento por selección...");

        for (int i = 0; i < tamanio - 1; i++) {
            int index_menor = i;
            if (verPaso) {
                System.out.println("\nIteración " + (i + 1) + ":");
                System.out.println("Elemento en posición " + i + ": " + numeros[i]);
                System.out.println("Identificando si hay cambio...");
            }

            for (int j = i + 1; j < tamanio; j++) {

                if (ascendente ? numeros[j] < numeros[index_menor] : numeros[j] > numeros[index_menor]) {
                    index_menor = j;

                }
            }
            if (verPaso) {
                System.out.println("Numero a comprar segun el orden pedido: "+numeros[index_menor]);
            }

            if (verPaso) {

                String cambio = index_menor != i ? "Se cambio "+numeros[i]+" embes de "+numeros[index_menor] : "No hubo cambio";
                System.out.println(cambio);

            } 

            if (index_menor != i) {
 
                int temp = numeros[i];
                numeros[i] = numeros[index_menor];
                numeros[index_menor] = temp;

            }

            // Imprimir el estado del arreglo después de cada paso
            if (verPaso) {
                System.out.println();
                System.out.print("Estado actual es: \n");
                imprime(numeros);
            }
        }
        if (verPaso) {
            System.out.println("Ordenamiento por selección completado.");
        }
        
        return numeros;
    }

    public int[] burbujaMejorado(int[] numeros, boolean verPaso, boolean asendente) {
        int bandera = 0;
        int tamanio = numeros.length;
        int aux;
        if (verPaso) {
            System.out.println("Iniciando metodo Burbuja Mejorado");
        }

        do {
            for (int i = 0; i < numeros.length; i++) {
                for (int j = i+1; j < numeros.length; j++) {
                    if (numeros[i]>numeros[j]) {
                        aux=numeros[i];
                        numeros[i]=numeros[j];
                        numeros[j]=aux;
                        i++;
                        
                    }
                    
                }
                
            }
            bandera++;
            
            
        } while (bandera!=tamanio);



        
        imprime(numeros);
        return numeros;

    }

    // Método para imprimir un arreglo
    public void imprime(int[] arreglo) {
        String salida="[";
        for (int i = 0; i < arreglo.length; i++) {
            if (i<arreglo.length-1) {
                salida+=arreglo[i]+", ";
            } else {
                salida+=arreglo[i];
            }
            
        }
        System.out.println(salida+"]");
    }
}
