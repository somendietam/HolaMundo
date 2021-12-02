public class Actuador
{
    /*** MODULO ACTUADOR ***/
    public Actuador(){
        
    }

    public String verificarDatos(int cantidad, int tiempo){
        String verificacion="";
        if(cantidad < 0 || tiempo < 0){
            verificacion="HA INGRESADO AL MENOS UN DATO ERRONEO, POR FAVOR RECTIFIQUE";
        }
        return verificacion;

    }

}
