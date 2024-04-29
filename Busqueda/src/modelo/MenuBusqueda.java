package modelo;

import java.util.Scanner;

public class MenuBusqueda {
    public void menuInicial(Scanner teclado, Busqueda metBusqueda) {
        int tamanio = 0;
        int option = 0;
        int[] numeros = new int[tamanio];
        do {
            System.out.println("""
                    Bienvenido al menu principal escoga una opcion:
                        1. Ingresar un arreglo
                        2. Escoger el metodo de busqueda
                        0. Salir
                    """);
            int op = teclado.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el tamanio del arreglo");
                    tamanio = teclado.nextInt();
                    numeros = new int[tamanio];

                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println("Ingrese el arreglo en la posicion[" + i + "]");
                        numeros[i] = teclado.nextInt();
                    }
                    System.out.println("Su arreglo es: ");
                    System.out.println(metBusqueda.imprimirArreglo(numeros, tamanio, 0));

                    break;
                case 2:
                    if (tamanio == 0) {
                        System.out.println("Primero debe ingresar un arreglo");
                    } else {
                        MenuMetodo metodoBuscar = new MenuMetodo();
                        metodoBuscar.menuBusqueda(numeros, teclado);
                    }
                    break;
                case 0:
                    option = 1;
                    System.out.println("Saliendo del programa...");
                    
                    break;

                default:
                    System.out.println("Opcion no valida... \nEscoga del 1 al 0");
                    break;
            }
        } while (option == 0);

    }
}
