package tp2_ej7;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    
    private String nombre;
    private int matricula;
    private int cupo;
    private Especialidad especialidad;
    private List <Historia> misHistorias = new ArrayList<>();

    public Medico(){
    };

    public Medico(String nombre, int matricula){
        this.nombre = nombre;
        this.matricula = matricula;
        this.cupo = 10;
        this.especialidad = Especialidad.FAMILIA;
    }

    public Medico(String nombre, int matricula, Especialidad especialidad, int cupo){
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.cupo = cupo;
    }

    public String getNombre(){
        return nombre;
    }

    public int getMatricula(){
        return matricula;
    }

    public Especialidad getEspecialidad(){
        return especialidad;
    }
    public int getCupo(){
        return cupo;
    }
    public boolean disponibilidad(){
        return misHistorias.size() < cupo;
    }
    
    public int cantTurnosLibres(){
        return misHistorias.size() - cupo;
    }
    

    /*
     *  public void darAlta(Historia h){
        if (misHistorias.contains(h)) {
            h.setAlta(true);
            misHistorias.remove(h);
        }
    }
     */

    public void darAlta(int idH){
        int i = 0;
        boolean encontrado = false;
        int n = misHistorias.size();
        while (i< n && !encontrado) {
            if(idH == misHistorias.get(i).getId()){
                encontrado = true;
            }else{
                i++;
            }
        }
        if(encontrado){
            misHistorias.remove(i);
        }
    }
   
    
    public List<Historia> getHistorias(){
        return misHistorias;
    }

    public void agregarHistoria(Historia h){
        misHistorias.add(h);
    }
    
}

