package tp2_ej6;
public class Persona {
    private int dni;
    private String nombres;
    private String apellidos;
    /*
     * CONSTRUCTORES
     */
    public Persona() {
    }
    public Persona(int dni, String nombres, String apellidos) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    /*
     * GETTERS
     */
    public int getDni() {
        return dni;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    /*
     * SETTERS
     */
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
}
