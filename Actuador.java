public class Actuador
{
    /*** MODULO ACTUADOR ***/
    private Captura captura;
    public Actuador(Captura cp1){
        this.captura=cp1;
    }

    public void verificarDatos(){
        String verificacion="null";
        if(this.captura.getCantidadPorcion() < 0 || this.captura.getTiempoEscaneo() < 0){
            System.out.println("Dato erroneo");
        }

    }

}
