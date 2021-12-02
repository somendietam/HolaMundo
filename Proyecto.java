import java.util.Scanner;

public class Proyecto
{
    static String nombre;
    static int cantidad;
    static int tiempo;
    static String nivelAlimento;

    public Proyecto()
    {

    }

    public static void main(String[] args)
    {
        System.out.println("---BIENVENIDO A SAAM---");

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("\n"+"- Ingrese 0 si desea finalizar la ejecucion del programa" + "\n"
                + "- Ingrese 1 para ingresar los datos de su mascota" + "\n"
                + "- Ingrese 2 para ver el estado del dispensador" + "\n"
                + "- Ingrese 3 para ver los datos almacenados" + "\n");

            int num = sc.nextInt();
            if(num == 0)
            {
                System.out.println("FIN DEL PROGRAMA");
                break;
            }
            switch(num){
                case 1:

                    Captura cp1 = new Captura();
                    nombre= cp1.ingresarNombre();
                    cantidad= cp1.ingresarPorcion();
                    tiempo= cp1.ingresarTiempoEscaneo();
                    nivelAlimento= cp1.getNivelAlimento();

                    Actuador ac1 = new Actuador();
                    String verificacion= ac1.verificarDatos(cantidad,tiempo);
                    System.out.println(verificacion);
                    break;

                case 2:

                    Procesamiento pr1 = new Procesamiento();
                    nivelAlimento=pr1.rellenar(nivelAlimento);
                    System.out.println("Estado del dispensador: "+nivelAlimento);

                    Persistencia pe1 = new Persistencia();
                    pe1.guardarDatos(nombre,cantidad,tiempo,nivelAlimento);
                    break;

                case 3:
                    Visualizacion vi1 = new Visualizacion();
                    vi1.mostrarDatos(nombre,cantidad,tiempo,nivelAlimento);
                    break;

                        
            }

        }
    }
}
