import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList
public class ProductosMercado {
    private String nombre;
    private double precio;
    public static ArrayList<ProductosMercado> productos = new ArrayList<ProductosMercado>();

    public ProductosMercado(String n, int p){
        this.nombre = n;
        this.precio = p;
        ProductosMercado.productos.add(this);
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public String toString(){
        return "Producto -- Nombre: "+this.nombre+", precio: "+this.precio+";

        public static String toStringProductos()
        {
            String texto = "";
            String texto1 = "";
            for (int i=0; i<ProductosMercado.productos.size();i++) {
                texto = ProductosMercado.productos.get(i).toString().concat("\n");
                texto1 = texto1.concat(texto);
            }
            return texto1;
        }

        public void guardarDatos(Productos[] productos){
            FileWriter fichero = null;
            PrintWriter pw = null;
            try
            {
                fichero = new FileWriter("./listaMercado.txt");
                pw = new PrintWriter(fichero);
                pw.println(ProductosMercado.productos.toStringPtoductos());

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    // Nuevamente aprovechamos el finally para
                    // asegurarnos que se cierra el fichero.
                    if (null != fichero)
                        fichero.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
}
