    public class PrincipalHerencia
    {
        public static void main(String[]args)
        {
            EmpleadoAsalariado e1 = new EmpleadoAsalariado();
            e1.setEmpresa("Apple");
            e1.setNombre("Maria");
            e1.setSalario(100);
            System.out.println(e1.getNombre());
            System.out.println(e1.toString());
        }
    }
