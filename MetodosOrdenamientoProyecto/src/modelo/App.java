/*
 * 
 * 
 * @DanielGuanga
 * @AlexGuaman
 */

package modelo;
import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        System.out.println("BIENVENIDO AL SISTEMA DE ORDENAMIENTOS");
        int[] arreglonumeros = new int[0];
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
                        mostrarSubmetodos(teclado, metodos, arreglonumeros);
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

    public static void mostrarSubmetodos(Scanner teclado, MetodosOrdenamiento metodos, int[] arreglo) {
        int opcionMetodo;
        // Aquí puedes implementar la lógica para mostrar los submétodos

        do {
            System.out.println("""
                    \n Escoja un metodo de Ordenamiento (Escoga un numero del 0 al 4)
                        1. Metodo Burbuja
                        2. Metodo Seleccion
                        3. Metodo Inserccion
                        4. Burbuja Mejorado
                        0. Regresar al Menu
                    """);
            opcionMetodo = teclado.nextInt();
            switch (opcionMetodo) {
                case 1:
                    // Solicitar al usuario el orden y si desea ver cada paso para el metodo burbuja
                    System.out.println("¿Cómo desea ordenar el arreglo?");
                    System.out.println("1. Ascendente");
                    System.out.println("2. Descendente");
                    int opcionOrden = teclado.nextInt();
                    boolean ascendente;

                    switch (opcionOrden) {
                        case 1:
                            ascendente = true;
                            break;
                        case 2:
                            ascendente = false;
                            break;
                        default:
                            System.out.println("Opción no válida. Se ordenará de forma ascendente por defecto.");
                            ascendente = true;
                            break;
                    }

                    System.out.println("¿Quiere ver cada paso del proceso de ordenamiento?");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    int opcionVerPaso = teclado.nextInt();
                    boolean verPaso;
                    switch (opcionVerPaso) {
                        case 1:
                            verPaso = true;
                            break;
                        case 2:
                            verPaso = false;
                            break;
                        default:
                            System.out.println("Opción no válida. Se mostrará cada paso por defecto.");
                            verPaso = true;
                            break;
                    }

                    // Ordeno el arreglo utilizando el método Burbuja con las opciones seleccionadas
                    // y mostrar el resultado
                    int[] arregloOrdenado = metodos.sortBubble(arreglo, verPaso, ascendente);
                    System.out.println("El arreglo ordenado por el método Bubble es: ");
                    metodos.imprime(arregloOrdenado);
                    break;

                case 2:
                    // Solicito al usuario el orden y si desea ver cada paso para el metodo seleccion
                    System.out.println("¿Cómo desea ordenar el arreglo?");
                    System.out.println("    1. Ascendente");
                    System.out.println("    2. Descendente");
                    int opcionOrden2 = teclado.nextInt();
                    boolean ascendente2;

                    switch (opcionOrden2) {
                        case 1:
                            ascendente2 = true;
                            break;
                        case 2:
                            ascendente2 = false;
                            break;
                        default:
                            System.out.println("Opción no válida. Se ordenará de forma ascendente por defecto.");
                            ascendente2 = true;
                            break;
                    }

                    System.out.println("¿Quiere ver cada paso del proceso de ordenamiento?");
                    System.out.println("    1. Sí");
                    System.out.println("    2. No");
                    int opcionVerPaso2 = teclado.nextInt();
                    boolean verPaso2;
                    switch (opcionVerPaso2) {
                        case 1:
                            verPaso2 = true;
                            break;
                        case 2:
                            verPaso2 = false;
                            break;
                        default:
                            System.out.println("Opción no válida. Se mostrará cada paso por defecto.");
                            verPaso2 = true;
                            break;
                    }

                    // Implemento lógica para el método de selección
                    int[] arregloSeleccionado = metodos.metodoSeleccion(arreglo, verPaso2, ascendente2);
                    System.out.println("El arreglo ordenado por el método de selección es: ");
                    metodos.imprime(arregloSeleccionado);
                    break;

                case 3:
                    // Solicitar al usuario el orden y si desea ver cada paso para el metodo insercion
                    System.out.println("¿Cómo desea ordenar el arreglo?");
                    System.out.println("1. Ascendente");
                    System.out.println("2. Descendente");
                    int opcionOrden3 = teclado.nextInt();
                    boolean ascendente3;

                    switch (opcionOrden3) {
                        case 1:
                            ascendente3 = true;
                            break;
                        case 2:
                            ascendente3 = false;
                            break;
                        default:
                            System.out.println("Opción no válida. Se ordenará de forma ascendente por defecto.");
                            ascendente3 = true;
                            break;
                    }

                    System.out.println("¿Quiere ver cada paso del proceso de ordenamiento?");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    int opcionVerPaso3 = teclado.nextInt();
                    boolean verPaso3;
                    switch (opcionVerPaso3) {
                        case 1:
                            verPaso3 = true;
                            break;
                        case 2:
                            verPaso3 = false;
                            break;
                        default:
                            System.out.println("Opción no válida. Se mostrará cada paso por defecto.");
                            verPaso3 = true;
                            break;
                    }

                    // Implemento lógica para el método de inserción
                    int[] arregloOrdenado1 = metodos.insertionSort(arreglo, verPaso3, ascendente3);
                    System.out.println("El arreglo ordenado por el método de inserción es:");
                    metodos.imprime(arregloOrdenado1);
                    break;

                case 4:
                    // Implemento lógica para el método de burbuja mejorado
                    System.out.println("""
                            ¿Como desea arreglar el arreglo?
                                1. Ascendente
                                2. Descendente
                            """);
                    int opcionOrden4 = teclado.nextInt();
                    boolean ascendente4;
                    switch (opcionOrden4) {
                        case 1:
                            ascendente4 = true;
                            break;
                        case 2:
                            ascendente4 = false;
                            break;

                        default:
                            System.out.println("Opcion no valida... \nSe ordenara ascendentemente por defecto");
                            ascendente4 = true;
                            break;
                    }
                    System.out.println("""
                        ¿Quiere ver cada paso del proceso de ordenamiento?
                            1. Sí
                            2. No
                        """);
                        int opcionVerPaso4 = teclado.nextInt();
                        boolean verPaso4;
                        switch (opcionVerPaso4) {
                            case 1:
                                verPaso4=true;
                                break;
                            case 2:
                                verPaso4=false;
                                break;
                        
                            default:
                                System.out.println("Opcion invalida... \nSe ejecutara con pasos por defecto");
                                verPaso4=true;
                                break;
                        }

                    int[] arregloBubbleMejor = metodos.burbujaMejorado(arreglo, verPaso4, ascendente4);
                    System.out.println("Su arreglo ordenado con el metodo burbuja mejorado es: ");
                    metodos.imprime(arregloBubbleMejor);
                    break;
                case 0:
                    System.out.println("Saliendo el programa de metodos ordenamiento...\n"+
                                        "Abriendo Menu Principal...\n");
                    break;
                default:
                    System.out.println("Opción no válida. Elija nuevamente.");
                    break;
            }

        } while (opcionMetodo != 0);
    }
}
