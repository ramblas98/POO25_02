package tp2_ej7;


public class Historia {
    public enum Estado{grave,medio,leve};
    private final int id;
    private static int siguienteId = 1;
    private String codigopaciente;
    private Estado estadoInicial;
    private Especialidad especialidad;
    private Medico medicoAsignado;
    private boolean altaPaciente;

    public Historia() {
        this.id = siguienteId++;
        this.altaPaciente = false;
    }

    public Historia(String codigopaciente, int estadoInicial, int especialidad) {
        this.id = siguienteId++;
        this.codigopaciente = codigopaciente;
        switch(estadoInicial){
            case 0: this.estadoInicial = Estado.leve; break;
            case 1: this.estadoInicial = Estado.medio; break;
            case 2: this.estadoInicial = Estado.grave; break;
        }
        switch(especialidad){
            case 0: this.especialidad = Especialidad.familia; break;
            case 1: this.especialidad = Especialidad.traumatologia; break;
            case 2: this.especialidad = Especialidad.pediatria; break;
            case 3: this.especialidad = Especialidad.internista; break;
            case 4: this.especialidad = Especialidad.otorrino; break;
            default: this.especialidad = Especialidad.familia; break;
        }
        this.altaPaciente = false;
    }

    public int getId() {
        return id;
    }

    public static int getSiguienteId() {
        return siguienteId;
    }

    public String getCodigopaciente() {
        return codigopaciente;
    }

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public boolean isAltaPaciente() {
        return altaPaciente;
    }

    public void setAltaPaciente(boolean altaPaciente) {
        this.altaPaciente = altaPaciente;
    }
    
    
    public void asignacionUnica(Medico m){
        if(this.medicoAsignado==null) this.medicoAsignado = m;
    }
    
    
    
    
    
    
}
