package tp2_ej7;

import java.util.ArrayList;
import java.util.Iterator;


public class CuadroMedico {
    private ArrayList<Medico> medicos;

    public CuadroMedico() {
        this.medicos = new ArrayList<>();
    }

    public CuadroMedico(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }
    
    
    public void insertarMedico(Medico m){
       this.medicos.add(m);
    }
    
    public void eliminarMedico(int matricula){
        Iterator<Medico> iterador = medicos.iterator();
        while(iterador.hasNext()){
            Medico i = iterador.next();
            if(i.getMatricula()==matricula) iterador.remove();
        }
    }
    
    public Medico obtenerMedicoMasDisponible(Especialidad e){
        Medico aux = new Medico();
        aux.setCupos(0);
        Iterator<Medico> iterador = medicos.iterator();
        while(iterador.hasNext()){
            Medico i = iterador.next();
            if(i.getEspecialidad()==e){
                if(i.getCupos()>aux.getCupos()) aux = i;
            }
        }
        if(aux.getCupos()==0) return null;
        else return aux;
    }
    
    public boolean asignar(Historia h){
        Medico m = obtenerMedicoMasDisponible(h.getEspecialidad());
        if(m == null) return false;
        else{
            h.asignacionUnica(m);
            for(int i=0;i<m.getHistorias().length;i++){
                if(m.getHistorias()[i]==null) m.getHistorias()[i] = h;
            }
            m.setCupos(m.getCupos()-1);
            return true;
        }
    }
}
