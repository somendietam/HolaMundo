
public class Visualizacion
{
    /*** MODULO VISUALIZACION ***/
    private Captura captura;
    private Procesamiento procesamiento;
    public Visualizacion(Captura cp1){
        this.captura=cp1;
    }
 

    public void mostrarDatos(){
        // Imprima los valores para verificar si la entrada
        // fue obtenida correctamente.
        System.out.println("Nombre de la mascota: "+this.captura.getNombreMascota());
        System.out.println("Cantidad de porcion: "+this.captura.getCantidadPorcion()+"g");
        System.out.println("Tiempo de escaneo: "+this.captura.getTiempoEscaneo()+"h");
        System.out.println("Resultado: "+this.captura.getResultado());
    }
}
