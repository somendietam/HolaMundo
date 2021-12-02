import java.util.Random;
public class Procesamiento
{
    /*** MODULO PROCESAMIENTO***/
    public Procesamiento(){

    }

    public String rellenar(String nivelAlimento){
        // S = Sensor
        Random Aleatorio = new Random(); 
        int S1 = Aleatorio.nextInt(2);
        int S2 = Aleatorio.nextInt(2);
        int S3 = Aleatorio.nextInt(2);
        // 1 = El sensor detecta comida
        if(S1 == 1){
            nivelAlimento="Bol lleno";
        }else if (S2==1){
            nivelAlimento="Rellenado con 1 porcion";
        }else if (S3==1){
           nivelAlimento="Rellenado con 2 porciones";
        }else{
            nivelAlimento="Rellenado completamente";
        }
        return nivelAlimento;
    }

}
