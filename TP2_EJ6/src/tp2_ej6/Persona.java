
package tp2_ej6;

public class Persona {

    private String apellido;
    private String nombre;
    private Long dni;

    public Persona(String apellido, String nombre, Long dni) {
        
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        
    }
    
    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getDni() {
        return dni;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }
    
    
    
}
