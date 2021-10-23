public class Arrayy
{
    static int i=0;
    public static void recorrerArray(int[] array, int indice){
        int arreglo[]=array;
        
       System.out.println(arreglo[i]);
       i++;
       if (i<arreglo.length){
           recorrerArray(arreglo,i);
       }
    }
}
