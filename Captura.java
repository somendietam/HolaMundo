import java.util.Scanner;
public class Captura
{
    /*** MODULO CAPTURA ***/

    private String nombreMascota="null";
    private int cantidadPorcion;
    private int tiempoEscaneo;
    private String resultado = "null";
    Scanner sc = new Scanner(System.in);

    public String ingresarNombre(){
        // entrada de una cadena
        System.out.println("Ingrese el nombre de la mascota");
        String n = sc.nextLine();
        this.nombreMascota=n;
        return this.nombreMascota;
    }

    public int ingresarPorcion(){
        // Entrada de datos numéricos
        System.out.println("Ingrese los gramos de cada porcion");
        int p = sc.nextInt();
        this.cantidadPorcion= p;
        return this.cantidadPorcion;
    }


    public int ingresarEscaneo(){
        System.out.println("Ingrese cada cuántas horas se debe realizar el escaneo");
        int t = sc.nextInt();
        this.tiempoEscaneo=t;
        return this.tiempoEscaneo;
    }

        
    public String getNombreMascota(){
        return this.nombreMascota;
    }
    
    public int getCantidadPorcion(){
        return this.cantidadPorcion;
    }

    public int getTiempoEscaneo(){
        return this.tiempoEscaneo;
    }
    
    public String getResultado(){
        return this.resultado;
    }
    
    public void setResultado(String n){
        this.resultado= n;
    }
}