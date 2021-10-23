import java.io.*;
public class Persistencia
{
            /*** MODULO PERSISTENCIA ***/
    private Captura captura;
    private Procesamiento procesamiento;
    public Persistencia(Captura cp1){
        this.captura=cp1;
    }
    
        public void guardarDatos(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("./prueba.txt");
            pw = new PrintWriter(fichero);
               pw.println("Nombre de la mascota: "+this.captura.getNombreMascota());
               pw.println("Cantidad de comida: "+this.captura.getCantidadPorcion());
               pw.println("Tiempo de escaneo: "+this.captura.getTiempoEscaneo());
               pw.println("Resultado: "+this.captura.getResultado());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}
