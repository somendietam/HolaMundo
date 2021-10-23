import java.util.ArrayList;
public class Repetidos{
    
    public static int detectorDeRepetidos(ArrayList<Integer>a){
        int sucesiones=0;
        int i=0;
        while(i<a.size() -1){
            if(i == 0 || a.get(i) != a.get(i-1)){
                    if(a.get(i)==a.get(i+1)){
                    sucesiones= sucesiones+1;
                    }
            }
            i++; 
        }
        return sucesiones;
    }

}
