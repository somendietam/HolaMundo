import java.util.ArrayList;
public class Verdura {
    public static ArrayList<Verdura> verduras = new ArrayList<Verdura>();

    public Verdura(String n, int p){
        this.nombre = n;
        this.precio = p;
        Verdura.verduras.add(this);
    }

    public static String toStringVerduras() {
        {
            String texto = "";
            String texto1 = "";
            for (int i = 0; i < Verdura.verduras.size(); i++) {
                texto = Verdura.verduras.get(i).toString().concat("\n");
                texto1 = texto1.concat(texto);
            }
            return texto1;
        }
    }
}

