import java.util.ArrayList;
public class Carne {
    public static ArrayList<Carne> carnes = new ArrayList<Carne>();

    public Carne(String n, int p){
        this.nombre = n;
        this.precio = p;
        Carne.carnes.add(this);
    }

    public String toString(){
        return "Producto -- Nombre: "+this.nombre+", precio: "+this.precio+";

        public static String toStringCarnes(){        {
            String texto = "";
            String texto1 = "";
            for (int i=0; i<Carne.carnes.size();i++) {
                texto = Carne.carnes.get(i).toString().concat("\n");
                texto1 = texto1.concat(texto);
            }
            return texto1;
        }
}
