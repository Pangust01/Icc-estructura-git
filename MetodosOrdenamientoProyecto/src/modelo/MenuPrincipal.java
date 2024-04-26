/*
 * @DanielGuanga
 * @AlexGuaman
 */
package modelo;

import java.util.Scanner;

public class MenuPrincipal {

    public void menuInicial(Scanner teclado, MetodosOrdenamiento metodos, MenuMetodos menuMetodo){
        System.out.println("\nBIENVENIDO AL SISTEMA DE ORDENAMIENTOS by.Alexis-Daniel");
        int[] arreglonumeros = new int[0];
        int opcion;
        do {

            System.out.println("\nMenu principal: (Escoga un numero del 0 al 2)");
            System.out.println("   1. Ingresar arreglo");
            System.out.println("   2. Ordenar arreglo");
            System.out.println("   0. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tamaño de su arreglo ");
                    int tamanio = teclado.nextInt();
                    arreglonumeros = new int[tamanio];
                    for (int i = 0; i < tamanio; i++) {
                        System.out.println("Ingrese el valor del arreglo en la posición [" + i + "]");
                        arreglonumeros[i] = teclado.nextInt();
                    }
                    System.out.println("Su arreglo es: ");
                    metodos.imprime(arreglonumeros);

                    break;
                case 2:
                    if (arreglonumeros.length == 0) {
                        System.out.println("No hay datos en el arreglo. Por favor, ingrese datos primero.");
                    } else {
                        menuMetodo.mostrarSubmetodos(teclado, metodos, arreglonumeros);
                        // Sub menu para escoger el tipo de bucle
                        System.out.println("Metodos para ordenar el arreglo:");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida. Repita");
                    break;
            }
        } while (opcion != 0);
    }

}
