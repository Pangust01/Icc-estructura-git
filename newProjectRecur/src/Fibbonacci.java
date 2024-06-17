

public class Fibbonacci {
    public long getFibonacciLoop(int n){
        long inicio = System.nanoTime();
        if (n <= 1) {
            return n;
        }
        long fib=1;
        long prefib=1;
        for (int i = 2; i < n; i++) {
            long temp = fib;
            fib+=prefib;
            prefib=temp;
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo1: "+(fin-inicio));
        return fib;
    }
    public long getFibonacciRecursivo(int n){
        
        if (n<=1) {
            return n;
        }
        long var = getFibonacciRecursivo(n-1)+getFibonacciRecursivo(n-2);
        return var;
        

    }
}
