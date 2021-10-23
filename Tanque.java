public class Tanque
{
    private int codigo;
    private int salud;
    private int ataque;
    
    public Tanque(){
        this(1001,4,8);
    }
    
    public Tanque(int cod,int sal,int ata){
        this.codigo=cod;
        this.salud=sal;
        this.ataque=ata;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public int getSalud(){
        return this.salud;
    }
    
    public int getAtaque(){
        return this.ataque;
    }
    
    public void setCodigo(int c){
        this.codigo= c;
    }
    
    public void setSalud(int s){
        this.salud= s;
    }
    
    public void setAtaque(int a){
        if(a>=0){
            this.ataque=a;
        }        
    }
    
    public static void ataque(Tanque t1,Tanque t2){
        int saludRestante =t2.getSalud()-t1.getAtaque();
        t2.setSalud(saludRestante);
        if (t2.getSalud()<=0){
            System.out.println("Tanque " + t2.getCodigo() + " destruido");
        }
    }
    
    public String toString(){
        return "Codigo: "+this.codigo+" Salud: "+this.salud+" Ataque: "+this.ataque;
    }
    
    public void mostrarTanquesVivos(){
        if(this.salud>0){
            System.out.println(toString());
        }
        
    }
}

