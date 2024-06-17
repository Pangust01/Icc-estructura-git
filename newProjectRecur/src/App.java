public class App {
    public static void main(String[] args) throws Exception {
        Factorial factorial = new Factorial();
        Potencia potencia = new Potencia();
        SumaDeDigitos sumDig = new SumaDeDigitos();
        Fibbonacci fib = new Fibbonacci();
        int num = 60;
        int base = 2;
        int exponente = 3;
        int digito=12345;
        System.out.println("El factorial de "+num+" es "+factorial.getfactorialLoop(num));
        System.out.println("El factorial de "+num+" es "+factorial.getFactorialRecursivo(num));
        System.out.println("La sumatoria de "+num+" es "+factorial.getSumatoriaLoop(num));
        System.out.println("La sumatoria de "+num+" es "+factorial.getSumatoriaRecursivo(num));
        System.out.println("La potencia de "+base+" al "+exponente+" "+potencia.getpotenciaRecursivo(base, exponente));
        System.out.println("La suma de digitos de "+digito+" es "+sumDig.sumaDeDigitos(digito));
        System.out.println("el fibonacci de "+num+" es "+ fib.getFibonacciLoop(num));
        long inicio = System.nanoTime();
        System.out.println("el fibonacci de "+num+" es "+ fib.getFibonacciRecursivo(num));
        long fin = System.nanoTime();
        System.out.println("Tiempo2: "+(fin-inicio));



    }
}
