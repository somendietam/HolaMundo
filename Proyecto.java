import java.util.Scanner;

public class Proyecto
{

    public Proyecto()
    {

    }

    public static void main(String[] args)
    {
        Captura cp1 = new Captura();
        cp1.ingresarNombre();
        cp1.ingresarPorcion();
        cp1.ingresarEscaneo();
        
        Actuador ac1 = new Actuador(cp1);
        ac1.verificarDatos();
         
        Procesamiento pr1 = new Procesamiento(cp1);
        pr1.rellenar();
        
        Persistencia pe1 = new Persistencia(cp1);
        pe1.guardarDatos();
        
        Visualizacion vi1 = new Visualizacion(cp1);
        vi1.mostrarDatos();
    }
}
