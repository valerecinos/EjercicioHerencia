public class Empleadoadministrativo extends Universidad  {

    public Empleadoadministrativo (){
        super ();
    }
    public Empleadoadministrativo(int id, String nombre, String apellido, int Edad, String puesto, int experiencia){
        super(id, nombre, apellido, Edad);
        this.puesto= puesto;
        this.experiencia = experiencia;
    }


    public String setpuesto(){
        this.puesto = puesto;
    }

    public int setexperiencia(){
        this.experiencia = experiencia;

    }

    public String getpuesto (){
        return puesto;
    }

    public int getexperiencia (){
        return experiencia;
    }

    public void trabajar(){
        System.out.println("Empleado: " + this.nombre +" "+ this.apellido +" esta trabajando");
    }

}

