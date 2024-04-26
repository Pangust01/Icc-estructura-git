/*
 * @DanielGuanga
 * @AlexGuaman
 */

package modelo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        MenuPrincipal menu = new MenuPrincipal();
        MenuMetodos menuM = new MenuMetodos();
        menu.menuInicial(teclado, metodos, menuM);

        
    }

    
}
