package modelo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        MenuBusqueda menu = new MenuBusqueda();
        Busqueda bus = new Busqueda();

        menu.menuInicial(teclado,bus);
    }
}
