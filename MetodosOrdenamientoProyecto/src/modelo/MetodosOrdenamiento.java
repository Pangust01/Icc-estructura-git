package modelo;

public class MetodosOrdenamiento {
    //Metodo Burbuja
    public int[] sortBubble(int[] arreglo, boolean verPaso, boolean ascendente) {
        int tamanio = arreglo.length;

        if (verPaso) {
            System.out.println("Iniciando ordenamiento burbuja...");
        }
        //Bucle del metodo para ordenar el arreglo
        for (int i = 0; i < tamanio; i++) {
            if (verPaso) {
                System.out.println("\nPaso número " + (i + 1));
            }
            for (int j = i + 1; j < tamanio; j++) {
                if (verPaso) {
                    System.out.println("Comparando elementos: i= " + arreglo[i] + ", j =" + arreglo[j]);
                }
                //Si es "ascendente" true asendente y si es false desendente
                if (ascendente ? arreglo[i] > arreglo[j] : arreglo[i] < arreglo[j]) {//Compara valores y si es verdad se hara cambios
                    if (verPaso) {
                        System.out.println("Intercambiando elementos...");
                    }
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
        System.out.println();

        return arreglo;//Retorna el arreglo ordenado
    }
    //Metodo Insercion
    public int[] insertionSort(int[] numeros, boolean verPaso, boolean ascendente) {
        int tamanio = numeros.length;

        if (verPaso) {
            System.out.println("Iniciando ordenamiento por inserción...");
        }
        //Bucle while dentro de un for para ordenar el arreglo
        for (int i = 1; i < tamanio; i++) {
            int elementoActual = numeros[i];
            int j = i - 1;
            if (verPaso) {
                System.out.println("\nIteración " + i + ":");
                System.out.println("Elemento inicial: " + numeros[j]);
                System.out.println("Comparando para saber si hay cambio...");
            }
            //Si "ascendente" es true asendente y si es false desendente
            while (j >= 0 && (ascendente ? numeros[j] > elementoActual : numeros[j] < elementoActual)) {//Compara valores y si es verdad se hara cambios

                if (verPaso) {
                    System.out.println("Se encontro un numero a comparar");
                    System.out.println(
                            "Se cambio de posicion el numero " + numeros[j] + " a la posicion [" + (j + 1) + "]");
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

        return numeros;//Retorna el arreglo ordenado
    }
    //Bucle Seleccion
    public int[] metodoSeleccion(int[] numeros, boolean verPaso, boolean ascendente) {
        int tamanio = numeros.length;
        System.out.println("Iniciando ordenamiento por selección...");
        //Un bucle for dentro de otro bucle for para ordenar el arreglo
        for (int i = 0; i < tamanio - 1; i++) {
            int index_menor = i;
            if (verPaso) {
                System.out.println("\nIteración " + (i + 1) + ":");
                System.out.println("Elemento en posición " + i + ": " + numeros[i]);
                System.out.println("Identificando si hay cambio...");
            }

            for (int j = i + 1; j < tamanio; j++) {
                //Si "ascendente" es true asendente y si es false desendente
                if (ascendente ? numeros[j] < numeros[index_menor] : numeros[j] > numeros[index_menor]) {//Compara valores y si es verdad se hara cambios
                    index_menor = j;

                }
            }
            if (verPaso) {
                System.out.println("Numero a comprar segun el orden pedido: " + numeros[index_menor]);
            }

            if (verPaso) {

                String cambio = index_menor != i ? "Se cambio " + numeros[i] + " embes de " + numeros[index_menor]
                        : "No hubo cambio";
                System.out.println(cambio);

            }

            if (index_menor != i) {//Si el numero menor es diferente a i hara cambios de posicion

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

        return numeros;//Retorna el arreglo ordenado
    }
    //Metodo Burbuja Mejorado
    public int[] burbujaMejorado(int[] numeros, boolean verPaso, boolean asendente) {
        int bandera = 0;
        int aux;
        if (verPaso) {
            System.out.println("\nIniciando metodo Burbuja Mejorado");

        }
        //Un bucle for dentro de un doWhile para ordenar el arreglo
        do {

            int i = 0;//Inicializo i para que sea desde la posicion 0

            for (int j = i + 1; j < numeros.length; j++) {
                if (verPaso) {
                    System.out.println("Verificando si hay cambio...");
                }
                //Si "ascendente" es true asendente y si es false desendente
                if (asendente ? numeros[i] > numeros[j] : numeros[i] < numeros[j]) {//Si se comple, habra cambios de posicion
                    //Imprime si verPaso=true
                    if (verPaso) {

                        System.out.print("Estado actual es: \n");
                        imprime(numeros);
                        System.out.println();
                        System.out.println("Se hizo un cambio");

                    }

                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                    if (verPaso) {
                        System.out.println("Se cambio " + numeros[j] + " por " + numeros[i]);
                    }

                }
                i++;//se suma i para que suba de posicion y con ello tambien cambie j de posicion

            }
            //UN bucle extra para que bandera y comprobar si todo esta arreglado
            for (i = 0; i < numeros.length - 1; i++) {
                int k = i + 1;//Inicializo otra variable que es una posicion extra que i
                //Si "ascendente" es true asendente y si es false desendente
                if (asendente ? numeros[i] > numeros[k] : numeros[i] < numeros[k]) {//Compara numeros para saber si uno se cumple
                    bandera = 1;//Si se cumple bandera sera 1 y el doWhile seguira trabajando
                    break;//Lo rompo al bucle porque si ya se cumple una vez sabre que el bucle falta por arreglar
                } else {
                    if (verPaso) {
                        System.out.println("Se finalizo el programa");
                    }
                    bandera = 0;//Si no se cumple lo anterior, bandera sera 0 y el bucle doWhile finalizara porque el arreglo estara arreglado
                }
            }

        } while (bandera != 0);

        return numeros;

    }

    // Método para imprimir un arreglo
    public void imprime(int[] arreglo) {
        String salida = "[";
        for (int i = 0; i < arreglo.length; i++) {
            if (i < arreglo.length - 1) {
                salida += arreglo[i] + ", ";
            } else {
                salida += arreglo[i];
            }

        }
        System.out.println(salida + "]");
    }
}
