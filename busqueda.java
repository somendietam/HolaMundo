import java.util.Scanner;
public class busqueda
{
    public static void main(String[] args){
        int[] arr_edades = {50,20,30,10,40};
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero a buscar");
        int num = entrada.nextInt();
        int posicion=0;
        int i=0;
        while(i<arr_edades.length){
            if(arr_edades[i]==num){
                posicion= i;
                break;
            }
            i++;
        }
        System.out.println(posicion);
    }
}
