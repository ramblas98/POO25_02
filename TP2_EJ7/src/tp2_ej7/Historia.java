
package tp2_ej7;

public class Historia {
    
    public enum Estado {
        
        GRAVE,
        MEDIO,
        LEVE
        
    }
    
    public enum Especialidad {
        
        FAMILIA,
        TRAUMATOLOGIA,
        PEDIATRIA,
        INTERNISTA,
        OTORRINO
        
    }
    
    private int identificador;
    private String codPaciente;
    private Estado estadoPaciente;
    private Especialidad especialidadMed;
    private Medico medicoAsig;
    private boolean alta;

    public Historia(int identificador, String codPaciente, Estado estadoPaciente, Especialidad especialidadMed, Medico medicoAsig, boolean alta) {
        
        this.identificador = identificador;
        this.codPaciente = codPaciente;
        this.estadoPaciente = estadoPaciente;
        this.especialidadMed = especialidadMed;
        this.medicoAsig = medicoAsig;
        this.alta = false;
        
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
    
    

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
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
    
    public void darAlta() {
        
        if (medicoAsig != null && !alta) {
            
            alta = true;
            medicoAsig.EliminarHistoria(this);
            
        }
        
    }
    
    public void AsignarMedico(Medico m) {
        
        if (this.medicoAsig == null) {
            
            this.medicoAsig = m;
            
        }
        
    }
    
}
