package Model;

public class Persona {
    private String nombre;
    private int edad;
    private Direccion direccion;


    public Persona(){
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.direccion = new Direccion("Calle principal 123", "Santiago", "Santiago", "789087981");
    }

    public Persona(String nombre, int edad, Direccion direccion){

        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }

    public Direccion getDireccion(){
        return direccion;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + ", Edad: " + edad + ", Direccion: " + direccion;
    }


}


