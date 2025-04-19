package tp2_ej7;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    private  final String nombre;
    private final int matricula;
    private final String especialidad;
    private int cupo;
    private final List<Historia> historias;

    public Medico(String nombre, int matricula, String especialidad, int cupo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = (especialidad == null) ? "familia" : especialidad;
        this.cupo = (cupo <= 0) ? 10 : cupo;
        this.historias = new ArrayList<>();
        
    }
    public Medico(String nombre, int matricula){
        this(nombre, matricula, "familia", 10);
    }
    public boolean estaDisponible(){
        return historias.size() < cupo;
    }

    public void agregarHistoria(Historia h){
        if(estaDisponible()){
            historias.add(h);
        }
    }
    public String getNombre() { return nombre; }
    public int getMatricula() { return matricula; }
    public String getEspecialidad() { return especialidad; }
    public int getCupo() { return cupo; }
    public void setCupo(int cupo) { this.cupo = cupo; }
    public List<Historia> getHistorias() { return historias; }
    @Override
    public String toString() {
        return "Medico [nombre=" + nombre + ", matricula=" + matricula + ", especialidad=" + especialidad + ", cupo="
                + cupo + ", historias=" + historias + "]";
    }
   
    
}
