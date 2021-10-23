public class Empleadoa extends Persona
{
    private String empresa;
    public void setEmpresa(String e){
        this.empresa = e;
    }

    public String getEmpresa(){
        return this.empresa;
    }

    @Override
    public String toString(){
        String text = "Empleado { nombre="+this.getNombre();
        text = text + " empresa="+this.empresa+" }";
        return text;
    }
}