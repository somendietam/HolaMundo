import java.util.Scanner;
public class PrincipalSensor
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        SensorLuz sl1 = new SensorLuz(18,40);

        String texto = entrada.next();
        while(!(texto.equals("salir"))){
            if(texto.equals("duplicar")){
                System.out.println(sl1.getIntensidad());
                System.out.println(sl1.duplicarIntensidad());
            }else if(texto.equals("asignarint")){
                int i = entrada.nextInt();
                sl1.setIntensidad(i);
            }
            texto = entrada.next();
        }
    }
}
