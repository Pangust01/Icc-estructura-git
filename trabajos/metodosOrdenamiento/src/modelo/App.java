package modelo;

public class App {
    public static void main(String[] args) throws Exception {
        Metodos obj1 = new Metodos();
        int[] num={2,4,5,7,3,4,6};
        System.out.println(obj1.arreglo(obj1.metodoSeleccion(num)));
        // int[] ordenado = obj1.metodoSeleccion(num);
        //llamar al metodo para imprimir y le mandamos el arreglo [ordenado]
    }
}
