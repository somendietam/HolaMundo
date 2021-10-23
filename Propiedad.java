import java.util.Scanner;
public class Propiedad {

    private String condicion;
    private int visitas;

    public Propiedad(String c){
        this.condicion = c;
        this.visitas = 0;
    }

    public String getCondicion(){
        return this.condicion;
    }

    public int getVisitas(){
        return this.visitas;
    }

    public void setCondicion(){
        String c;
        do{
            System.out.println("Ingrese la condicion de la propiedad");
            Scanner entrada = new Scanner(System.in);
            c = entrada.next();
        }while(!(c.equals("nueva")||c.equals("usada")));
        this.condicion = c;   
    }

    public void aumentarVisitas(){
        if(this.condicion.equals("nueva")){
            this.visitas = this.visitas+2;
        }else{
            this.visitas = this.visitas+1;
        }
    }
} 
