public class Empleado
{
    private String nombre;
    private double salario;
        public Empleado(String n, double s){
        this.nombre = n;
        this.salario = s;
    }

    public double getSalario(){
        return this.salario;
    }
    
    
}