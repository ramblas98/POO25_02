
package tp2_ej7;

public class Historia {
    
    private static int cont = 1000;
    private String nombre;
    private int identificador = 0;
    private String codPaciente;
    private Estado estadoPaciente;
    private Especialidad especialidadMed;
    private Medico medicoAsig;
    private boolean alta;

    public Historia(String nombre, String codPaciente, Estado estadoPaciente, Especialidad especialidadMed) {
        
        this.nombre = nombre;
        this.identificador = CrearIden();
        this.codPaciente = codPaciente;
        this.estadoPaciente = estadoPaciente;
        this.especialidadMed = especialidadMed;
        this.alta = false;
        
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getIdentificador() {
        return identificador;
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public Estado getEstadoPaciente() {
        return estadoPaciente;
    }

    public Especialidad getEspecialidadMed() {
        return especialidadMed;
    }

    public Medico getMedicoAsig() {
        return medicoAsig;
    }

    public boolean isAlta() {
        return alta;
    }

    
    
    public void setNombre(String nombree) {
        this.nombre = nombree;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public void setEstadoPaciente(Estado estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public void setEspecialidadMed(Especialidad especialidadMed) {
        this.especialidadMed = especialidadMed;
    }

    public void setMedicoAsig(Medico medicoAsig) {
        this.medicoAsig = medicoAsig;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }
    

    
    public void AsignarMedico(Medico m) {
        
        if (this.medicoAsig == null && !this.alta) {
            
            this.medicoAsig = m;
            
        }
        
    }
    
    public static int CrearIden() {
        
        return cont++;
        
    }
    
    
    
}
