public class Alumno extends Universidad {

    public Alumno (){
        super();
    }
    
    public Alumno (int id, String nombre, String apellido, int Edad, int semestre, String carrera, int carnet){
        super(id, nombre, apellido, Edad);
        this.semestre = semestre;
        this.carrera = carrera;
        this.carnet = carnet;
    }
    
    public int setsemestre(){
        this.curso = curso;
    }

    public String setcarrera(){
        this.carrera = carrera;
    }

    public int setcarnet(){
        this.carnet = carnet;
    }

    public int getsemestre(){
        return semestre;
    }

    public String getcarrera(){
        return carrera;
    }

    public int getcarnet(){
        return carnet;
    }

    public void Estudiar (){
        System.out.println("Alumno: " + this.nombre +" "+ this.apellido + "esta estudiando" + this.carrera + "en el semestre"+ this.semestre);
    }



}
