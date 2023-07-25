public class Catedratico extends Universidad {

    public Catedratico () {
        super ();
    }

    public Catedratico (int id, String nombre, String apellido, int Edad, String curso, int codigo) {
        super(id, nombre, apellido,Edad);
        this.curso = curso;
        this.codigo = codigo;
    }

    public String setcurso(){
        this.curso = curso;
    }

    public int setcodigo(){
        this.codigo=codigo;
    }

    public String getcurso(){
        return curso;
    }

    public int getcodigo(){
        return codigo;
    }

    public void trabajar (){
        System.out.println("Catedratico: " + this.nombre +" "+ this.apellido + "esta enseñando" + this.curso);
    }
    

    

    
}
