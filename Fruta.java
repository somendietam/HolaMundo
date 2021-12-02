import java.util.ArrayList;
public class Fruta {
    public static ArrayList<Fruta> frutas = new ArrayList<Fruta>();

    public Fruta(String n, int p) {
        this.nombre = n;
        this.precio = p;
        Fruta.frutas.add(this);
    }

    public String toString(){
        return "Producto -- Nombre: "+this.nombre+", precio: "+this.precio+";

        public static String toStringFrutas()
        {
            String texto = "";
            String texto1 = "";
            for (int i=0; i<Fruta.frutas.size();i++) {
                texto = Fruta.frutas.get(i).toString().concat("\n");
                texto1 = texto1.concat(texto);
            }
            return texto1;
        }
}
