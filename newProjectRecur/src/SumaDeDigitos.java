public class SumaDeDigitos {
    public long sumaDeDigitos(int n){
        if (n<10) {
            return n;
        } else {
            return n%10+sumaDeDigitos(n/10);
        }
    }
}
