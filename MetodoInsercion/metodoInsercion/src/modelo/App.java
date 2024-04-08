package modelo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        MetodosOrdenamiento obj1 = new MetodosOrdenamiento();
        // System.out.println("Ingrese un numero: ");
        // option=teclado.nextInt();
        // System.out.println("Ingreso: "+option);
        int option;
        do {
            System.out.print
            ("""
                    Menu principal
                        1. Ingrese al metodo
                        0. Salir del programa
                    """);
            option = teclado.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingreso al metodo de insercion");
                    int[] numeros = {8,2,-5,10};
                    obj1.insertionSort(numeros);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.\nHasta luego");
                    break;
            
                default:
                    System.out.println("Escoga un numero del 1 al 0");
                    break;
            }
        } while (option!=0);

        teclado.close();
    }
}
