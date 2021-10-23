public class InvertirArreglo{
    public static int[] invertir(int[] a){
        int temporal;
        int j = a.length-1;
        int i=0; 
        while(i<(a.length/2)){
            temporal=a[i];
            a[i]=a[j];
            a[j]=temporal;
            j--;
            i++;
        }
        return a;
    }

    public static void imprimir(int[] a){
        for (int k=0;k<a.length;k++){
            if(k!=a.length-1){
                System.out.print(a[k]+",");
            }else{
                System.out.print(a[k]);
            }
        }
    }
}