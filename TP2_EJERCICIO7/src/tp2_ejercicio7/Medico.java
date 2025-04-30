/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ejercicio7;

/**
 *
 * @author Administrador
 */
class Medico {
    private String nombre;
    private int matricula;
    private Especialidad especialidad; //enumerado
    private int cupos;
    private Historia historias[];
    private int i0;

    public Medico() {
        this.especialidad = Especialidad.familia;
        this.cupos = 10;
    }

    public Medico(String nombre, int matricula, int especialidad, int cupos) {
        this.nombre = nombre;
        this.matricula = matricula;
        switch(especialidad){
            case 0: this.especialidad = Especialidad.familia; break;
            case 1: this.especialidad = Especialidad.traumatologia; break;
            case 2: this.especialidad = Especialidad.pediatria; break;
            case 3: this.especialidad = Especialidad.internista; break;
            case 4: this.especialidad = Especialidad.otorrino; break;
            default: this.especialidad = Especialidad.familia; break;
        }
        this.cupos = cupos;
        this.historias = new Historia[this.cupos];
    }
    
    public Medico(String nombre, int matricula, int especialidad) {
        this.nombre = nombre;
        this.matricula = matricula;
        switch(especialidad){
            case 0: this.especialidad = Especialidad.familia; break;
            case 1: this.especialidad = Especialidad.traumatologia; break;
            case 2: this.especialidad = Especialidad.pediatria; break;
            case 3: this.especialidad = Especialidad.internista; break;
            case 4: this.especialidad = Especialidad.otorrino; break;
            default: this.especialidad = Especialidad.familia; break;
        }
        this.cupos = 10;
        this.historias = new Historia[this.cupos];
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public int getCupos() {
        return cupos;
    }

    public Historia[] getHistorias() {
        return historias;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }
    
    public boolean disponibilidad(){
        return this.historias.length < this.cupos;
    }
    
    public void darAlta(Historia h){
        Historia aux;
        for(int i=0;i<this.historias.length;i++){
            if(this.historias[i].getCodigopaciente()==h.getCodigopaciente()){
                this.getHistorias()[i] = null;
                h.setAltaPaciente(true);
            }
        }
    }
}
