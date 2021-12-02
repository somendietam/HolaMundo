import java.util.ArrayList;
public class Supermercado {
    public static ArrayList<Supermercado> supermercados = new ArrayList<Supermercado>();

    public Supermercado(String n, int p){
        this.nombre = n;
        this.precio = p;
        Supermercado.supermercados.add(this);
    }

    public static String toStringSupermercados() {
        {
            String texto = "";
            String texto1 = "";
            for (int i = 0; i < Supermercado.supermercados.size(); i++) {
                texto = Supermercado.supermercados.get(i).toString().concat("\n");
                texto1 = texto1.concat(texto);
            }
            return texto1;
        }
    }
}
