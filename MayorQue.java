import java.util.ArrayList;
public class MayorQue{
    public static void mayor(int[] a){
        ArrayList<Integer>arregloMayores=new ArrayList<Integer>();

        int i=0;
        do{
            if(a[i]>a[0]){
                arregloMayores.add(a[i]);
            }
            i++;
        }while(i<a.length);

        if(arregloMayores.size()==0){
            System.out.println("No hay ningun numero mayor que el primero");
        }else{
            int j=0;
            while(j<arregloMayores.size()){
                System.out.println(arregloMayores.get(j));
                j++; 
            }

        }
    }
}