import java.util.Scanner;
public class Arreglos{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamano del arreglo");
        int tamano = entrada.nextInt();
        
        int[]arreglo= new int[tamano];
        int i=0;
        while(i<tamano){
           arreglo[i]=5;
           i=i+1; 
        }
        int j=0;
        while(j<tamano){
            System.out.println(arreglo[j]);
            j=j+1; 
        }
       
    }
}