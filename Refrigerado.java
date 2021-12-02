import java.util.ArrayList;
public class Refrigerado {
    public static ArrayList<Refrigerado> refrigerados = new ArrayList<Refrigerado>();

    public Refrigerado(String n, int p) {
        this.nombre = n;
        this.precio = p;
        Refrigerado.refrigerados.add(this);
    }

    public String toString() {
        return "Producto -- Nombre: " + this.nombre + ", precio: " + this.precio + ";
    }

    public static String toStringRefrigerados() {
        {
            String texto = "";
            String texto1 = "";
            for (int i = 0; i < Refrigerado.refrigerados.size(); i++) {
                texto = Refrigerado.refrigerados.get(i).toString().concat("\n");
                texto1 = texto1.concat(texto);
            }
            return texto1;
        }
    }
}