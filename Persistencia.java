import java.io.*;
public class Persistencia
{
    /*** MODULO PERSISTENCIA ***/
    public Persistencia(){
       
    }
    
        public void guardarDatos(String nombre, int cantidad, int tiempo, String nivelAlimento){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("./prueba.txt");
               pw = new PrintWriter(fichero);
               pw.println("Nombre de la mascota: "+nombre);
               pw.println("Cantidad de comida: "+cantidad+"g");
               pw.println("Tiempo de escaneo: "+tiempo+"h");
               pw.println("Nivel de alimento: "+nivelAlimento);

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
