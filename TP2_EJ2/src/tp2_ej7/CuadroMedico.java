package tp2_ej7;

import java.util.ArrayList;
import java.util.List;

public class CuadroMedico {
    private List<Medico> medicos;

    public CuadroMedico(){
        this.medicos = new ArrayList<>();
    }

    public void insertarMedico(Medico medico){
        medicos.add(medico);
    }

    public void eliminarMedico(Medico medico){
        medicos.remove(medico);
    }

    public Medico obtenerMedicoDisponible(String especialidad){
        Medico disponible = null;
        for (int i = 0; i < medicos.size(); i++) {
            Medico actual = medicos.get(i);
            if(actual.getEspecialidad().equalsIgnoreCase(especialidad)){
                int pacientesAtendidos = actual.getHistorias() == null ?0 : actual.getHistorias().size();
                if (pacientesAtendidos < actual.getCupo()) {
                    if(disponible == null || pacientesAtendidos < disponible.getHistorias().size()){
                        disponible = actual;
                    }
                }
            }
        }
        return disponible;
    }
}
