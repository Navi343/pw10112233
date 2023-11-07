package Java;
import java.util.*;
public interface interfaz {
    int constante = 8;
    String [] nombre ={"kevin"};

    public static void main(String [] args){
        Random rnd = new Random(10);
        int [] arreglo =new int [10];
        for(int i = 0; i<10;i++){
            arreglo[i] = rnd.nextInt(10); 
            System.out.println("Valor");
        }
    }
    
}
