package modelo;

import java.util.Scanner;

public class MenuMetodo {
    public void menuBusqueda(int[] arreglo, Scanner teclado){
        Busqueda busqueda= new Busqueda();
        MenuBusqueda menu1= new MenuBusqueda();
        int cerrar=0;
        do {
            System.out.println("""
                    Bienvenido, escoga el metodo de busqueda que desea usar
                        1. Busqueda Binaria
                        0. Regresar al menu principal
                    """);
                    int op1=teclado.nextInt();
                    switch (op1) {
                        case 1:
                        int[] arregloOrdenado=busqueda.insertionSort(arreglo);
                        
                        System.out.println("Digite el numero que quiere encontrar en su arreglo:");
                        int numEncontrar=teclado.nextInt();
                        int numEncontrado=busqueda.busquedaBinaria(arregloOrdenado, numEncontrar);
                        System.out.println("Numero encontrado es: "+arregloOrdenado[numEncontrado]);
                        
                            break;
                        case 0:
                            menu1.menuInicial(teclado, busqueda);
                            cerrar=1;
                            break;
                    
                        default:
                            System.out.println("Opcion no valida...");
                            break;
                    }
        } while (cerrar==0);
    }
}
