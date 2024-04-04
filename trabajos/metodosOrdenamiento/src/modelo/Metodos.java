package modelo;

public class Metodos {
    public int[] metodoSeleccion(int[] numeros){
        
        for (int i = 0; i < numeros.length-1; i++) {
            int index_menor=i;
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[j]<numeros[index_menor]) {
                    index_menor=j;
                    
                }
                int aux=numeros[index_menor];
                numeros[index_menor]=numeros[i];
                numeros[i]=aux; 

            }
        }
        return numeros;

    }
    public String arreglo(int[] numeros){
        String salida="[ ";
        for (int i = 0; i < numeros.length; i++) {

            if (i<numeros.length-1) {
                salida+=numeros[i]+ "-";
            }else{
                salida+=numeros[i];
            }
                    
        }
        
        return salida+=" ]";
    }
    //crear un metodo que reciva un arreglo de nuevo y lo imrpima
}
