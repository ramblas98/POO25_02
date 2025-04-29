package tp2_ej7;

public class Historia {
    private static int contador = 0;  //Atributo de clase
    private int id; //Debe ser unico, consecutivo
    private String codigo;
    private Estado estado;
    private Especialidad especialidad;
    private Medico medicoAsignado;
    private boolean altaPaciente;

    public Historia(){
        this.id = Historia.contador + 1;
        Historia.contador++;
    }

    public Historia(String codigo, Estado estado, Especialidad especialidad){
        this.codigo = codigo;
        this.estado = estado;
        this.especialidad = especialidad;
        this.id =  Historia.contador + 1;
        Historia.contador++;
    }

    public String getCodigo(){
        return codigo;
    }
    public Estado estado(){
        return estado;
    }
    public int getId(){
        return id;
    }
    public Especialidad getEspecialidad(){
        return especialidad;
    }

    public boolean getAlta(){
        return altaPaciente;
    }

    public Medico getMedico(){
        return medicoAsignado;
    }

    public void setAlta(boolean alta){
        this.altaPaciente = alta;
    }


    public void setMedicoAsignado(Medico medico){
        this.medicoAsignado = medico;
    }
}
