public class PrincipalPropiedad {
    public static void main(String[] args) {
        Propiedad casa = new Propiedad("nueva");

        casa.aumentarVisitas();
        casa.aumentarVisitas();
        casa.aumentarVisitas();

        casa.setCondicion();
        
        casa.aumentarVisitas();
        casa.aumentarVisitas();
        casa.aumentarVisitas();
        
        System.out.println("El numero de visitas es: "+casa.getVisitas());

    }
}