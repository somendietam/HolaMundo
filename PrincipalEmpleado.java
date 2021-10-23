public class PrincipalEmpleado
{
    public static void main(String[] args){
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Sara", 200);
        empleados[1] = new Empleado("Michael", 100);
        empleados[2] = new Empleado("Mariana", 300); 
        System.out.println("El mayor salario es:"+PrincipalEmpleado.CalcularMayor(empleados));
    }

    public static double CalcularMayor(Empleado[] empleados){
        double mayorSal = empleados[0].getSalario();
        for(int i=0; i<empleados.length; i++){
            if (empleados[i].getSalario() > mayorSal){
                mayorSal= empleados[i].getSalario();
            }

        }
        return mayorSal;
    }
}