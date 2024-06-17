public class Factorial {
    public long getfactorialLoop(int n){
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado*=i;
        }
        return resultado;
    }

    //Metodo con recursividad
    //Caso base --> n sea 0 retornara el valor de 1
    public long getFactorialRecursivo(int n){
        if (n==0 || n==1) {
            return 1;
        }else{
            return n *getFactorialRecursivo(n-1);
        }
    }

    public long getSumatoriaLoop(int n){
        long resultado = 0;
        for (int i = 0; i <= n; i++) {
            resultado+=i;
        }
        return resultado;
    }

    public long getSumatoriaRecursivo(int n){
        
        if (n == 0) {
            return 0;
        } else {
            return n+getSumatoriaRecursivo(n-1);
        }

    }

}
