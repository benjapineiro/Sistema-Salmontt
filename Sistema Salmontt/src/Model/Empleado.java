package Model;


public class Empleado extends Persona {
    private String cargo;


public Empleado(String nombre, int edad, Direccion direccion, String cargo) {
    super(nombre, edad, direccion);
    this.cargo = cargo;
 }

 @Override
 public String toString(){
    return super.toString() + ", Cargo: " + cargo;
 }

}
