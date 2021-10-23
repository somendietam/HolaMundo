public class TablaMultiplicar {
    public static void main(String[] args) {
        int fila = 9;
        int columna = 9;

        for (int i=1; i<=fila; i=i+1){
            for (int j=i; j<=columna*i; j=j+i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
