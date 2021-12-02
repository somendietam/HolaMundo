import java.util.Scanner;
import java.util.InputMismatchException;
public class Captura
{
    /*** MODULO CAPTURA ***/

    private String nombreMascota="null";
    private int cantidadPorcion;
    private int tiempoEscaneo;
    private String nivelAlimento = "null";
    Scanner sc = new Scanner(System.in);

    public String ingresarNombre(){
        // entrada de una cadena
        System.out.println("Ingrese el nombre de la mascota");
        String n = sc.next();
        this.nombreMascota=n;
        return this.nombreMascota;
    }

    public int ingresarPorcion(){
        boolean continua;
        // Entrada de datos numericos
        do{
            try {
                continua = false;
                System.out.println("Ingrese los gramos de cada porcion");
                int p = sc.nextInt();
                this.cantidadPorcion= p;
            } catch (java.util.InputMismatchException ex){
                System.out.println("Debe ingresar obligatoriamente un numero entero");
                sc.next();
                continua = true;
            }
        }while (continua);

        return this.cantidadPorcion;
    }

    public int ingresarTiempoEscaneo(){
        boolean continua;
        do{
            try {
                continua = false;
                System.out.println("Ingrese cada cuantas horas se debe realizar el escaneo");
                int t = sc.nextInt();
                this.tiempoEscaneo=t;
            } catch (java.util.InputMismatchException ex){
                System.out.println("Debe ingresar obligatoriamente un numero entero");
                sc.next();
                continua = true;
            }
        }while(continua);
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

    public void setNivelAlimento(String n){
        nivelAlimento= n;
    }

    public String getNivelAlimento(){
        return this.nivelAlimento;
    }

}