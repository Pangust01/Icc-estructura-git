public class Potencia {
    public long getpotenciaRecursivo(int base, int exponente){
        if (exponente==0) {
            return 1;
        } else {
            return base*getpotenciaRecursivo(base, exponente-1);
        }
    }
}
