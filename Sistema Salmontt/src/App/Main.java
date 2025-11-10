package App;

import Model.Direccion;
import Model.Empleado;
import Model.Persona;

public class Main {
    public static void main(String[] args) {

        Direccion direccion1 = new Direccion("Av. Los Robles 456", "Puerto Montt", "Los Lagos", "989765430");
        Direccion direccion2 = new Direccion("Calle Larga 120", "Osorno", "Los Lagos", "123445649");
        Direccion direccion3 = new Direccion("Pasaje Central 50", "Valdivia", "Los Ríos", "109283745");

        Persona persona1 = new Persona("Carlos Soto", 30, direccion1);
        Persona persona2 = new Persona("María Fuentes", 22, direccion2);
        Empleado empleado1 = new Empleado("Benjamin Piñeiro", 23, direccion3, "Agente");

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(empleado1);
    }
}
