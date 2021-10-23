
public class PrincipalTanque
{
    public static Tanque[] tanques= new Tanque[3];

    public static void main (String[] args){
        tanques[0] = new Tanque();
        tanques[1] = new Tanque(1002,15,15);
        tanques[2] = new Tanque(1003,10,8);
        
        for(int i=0; i<PrincipalTanque.tanques.length; i++){
            PrincipalTanque.tanques[i].mostrarTanquesVivos();
        }
        Tanque.ataque(tanques[0],tanques[1]);
        Tanque.ataque(tanques[2],tanques[0]);
        for(int i=0; i<PrincipalTanque.tanques.length; i++){
            PrincipalTanque.tanques[i].mostrarTanquesVivos();
        }
    }

}
