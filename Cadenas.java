import java.util.Scanner;
public class Cadenas{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un texto");
        String texto = entrada.nextLine();
        int contador = 0;
        
        int i=0;
        while (i<texto.length()){
            if(texto.charAt(i)=='a'){
                contador = contador+1;
            }
            i = i+1;
        }

        System.out.println("La cantidad de aes encontradas es "+contador);
  }
}