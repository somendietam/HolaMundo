import java.net.*;
import java.io.*;
public class EjercicioEstrella
{
    public static void main(String[] args) throws Exception
    {
        String rutaJumbo = "https://listado.mercadolibre.com.co/bolsos";
        URL url = new URL(rutaJumbo);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String codigoFuente = "";
        String linea;
        while ((linea = reader.readLine()) != null)
        {
            codigoFuente = codigoFuente + linea;
        }
        reader.close();
        //System.out.println(codigoFuente);  
        int i= codigoFuente.indexOf("ui-search-price ui-search-price--size-medium ui-search-item__group__element");
        while(i<codigoFuente.length()){
            int desde= codigoFuente.indexOf("ui-search-price ui-search-price--size-medium ui-search-item__group__element",i)+74;
            if(desde<74){
                break;
            }
            int hasta= codigoFuente.indexOf("ui-search-item__group__element ui-search-installments ui-search-color",desde);
            String infoprecio= codigoFuente.substring(desde,hasta);

            int pinicialp= infoprecio.indexOf("price-tag-fraction")+20;
            int pfinalp= infoprecio.indexOf("<",pinicialp);
            String precio= infoprecio.substring(pinicialp,pfinalp);

            int pinicialn= codigoFuente.indexOf("ui-search-item__title ui-search-item__group__element",i)+54;
            int pfinaln= codigoFuente.indexOf("<",pinicialn);
            String nombre= codigoFuente.substring(pinicialn,pfinaln);

            System.out.println("Nombre: "+nombre+". Precio: "+precio);

            i=pinicialn+1;
        }
    }

}
