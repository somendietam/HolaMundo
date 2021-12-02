import java.util.ArrayList;
public class Aseo {
    public static ArrayList<Aseo> aseos = new ArrayList<Aseo>();

    public Aseo(String n, int p){
        this.nombre = n;
        this.precio = p;
        Aseo.aseos.add(this);
    }

    public static String toStringAseos() {
        {
            String texto = "";
            String texto1 = "";
            for (int i = 0; i < Aseo.aseos.size(); i++) {
                texto = Aseo.aseos.get(i).toString().concat("\n");
                texto1 = texto1.concat(texto);
            }
            return texto1;
        }
    }
}
