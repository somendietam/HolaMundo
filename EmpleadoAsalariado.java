public class EmpleadoAsalariado extends Empleadoa
{
    private float salario;
    public void setSalario(float s)
    {
        this.salario = s;
    }

    public float getSalario()
    {
        return this.salario;
    }

    @Override
    public String toString()
    {
        String text = "EmpleadoAsalariado { nombre="+this.getNombre();
        text = text + " empresa="+this.getEmpresa();
        text = text + " salario="+this.salario+" }";
        return text;
    }
}