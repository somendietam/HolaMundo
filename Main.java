import java.util.Scanner;
public class Main
{
    public static void main(String[] args)throws Exception{
        //recolectar datos    
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la mascota (Solo se permiten letras)");
        String n = sc.next();
        System.out.println("Ingrese cada cu�ntas horas come su mascota (Solo se permiten n�meros)");
        int t = sc.nextInt();
        
        //crear Saam
        Saam miSaam = new Saam();
        
        //invocar m�todo ingresar nombre
        String nombre = miSaam.ingresarNombre(n);
        
        //invocar m�todo ingresar tiempo
        int tiempo = miSaam.ingresarTiempo(t);
        
        //imprimir datos de la mascota
        System.out.println("El nombre de tu mascota es: "+nombre+" y come cada "+tiempo+" horas");
    }
}
