package Entidades;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Persona {

     String nombre;
     String apellido;

    public Persona(){
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
