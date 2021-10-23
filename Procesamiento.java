public class Procesamiento
{
           /*** MODULO PROCESAMIENTO***/
    
    private Captura captura;
    public Procesamiento(Captura cp1){
        this.captura=cp1;
    }
           
        public void rellenar(){
        // S = Sensor
        
        int S1=0;
        int S2=0;
        int S3=0;
        // 1 = El sensor detecta comida
        if(S1 == 1){
            this.captura.setResultado("Bols llenos");
        }else if (S2==1){
            this.captura.setResultado("Rellenando con 1 porcion");
        }else if (S3==1){
            this.captura.setResultado("Rellenando con 2 porciones");
        }else{
            this.captura.setResultado("Rellenando completamente");
        }
    }
    

}
