
public class Visualizacion
{
    /*** MODULO VISUALIZACION ***/
    public Visualizacion(){
        
    }

    public void mostrarDatos(String nombre, int cantidad, int tiempo, String nivelAlimento){
        // Imprima los valores para verificar si la entrada
        // fue obtenida correctamente.
        System.out.println("Nombre de la mascota: "+nombre);
        System.out.println("Cantidad de porcion: "+cantidad+"g");
        System.out.println("Tiempo de escaneo: "+tiempo+"h");
        System.out.println("Nivel de alimento: "+nivelAlimento);
    }
}
