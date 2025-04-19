package tp2_ej7;

public class Historia {
    private static int cont = 1;
    private int id;
    private final String CP;
    private final String estado;
    private final String especialidad;
    private Medico medicoAsignado;
    private boolean altaPaciente;

    
    public Historia( String cP, String estado,String especialidad) {
        this.id = cont++;
        this.CP = cP;
        this.especialidad = especialidad;
        this.medicoAsignado = null;
        this.estado = estado;
        this.altaPaciente = false;
    }

    public void asignarMedico(Medico m){
        if(this.medicoAsignado == null){
            this.medicoAsignado = m;
        }
    }

    public void darAlta(){
        this.altaPaciente = true;
    }


    public int getId() { return id; }
    public void setMedicoAsignado(Medico medicoAsignado){this.medicoAsignado = medicoAsignado;}
    public String getCP() { return CP; }
    public String getEstado() { return estado; }
    public String getEspecialidad() { return especialidad; }
    public boolean tieneAlta() { return altaPaciente; }
    public Medico getMedicoAsignado() { return medicoAsignado; }

    @Override
    public String toString() {
        return "Historia [id=" + id + ", CP=" + CP + ", estado=" + estado +
               ", especialidad=" + especialidad + ", medicoAsignado=" +
               (medicoAsignado != null ? medicoAsignado.getNombre() : "No asignado") +
               ", altaPaciente=" + altaPaciente + "]";
    }
}
