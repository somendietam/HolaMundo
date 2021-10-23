public class SumaMatrizDigital
{
    public static int sumaDiagonal(int[][] arr){
        int suma=0;
        for(int i=0; i<arr.length; i++){
            suma= arr[i][i]+suma;
        }
        return suma;
    }
}
