
package tp2_ej7;

public class Medico {
    
    public enum Especialidad {
        
        FAMILIA,
        TRAUMATOLOGIA,
        PEDIATRIA,
        INTERNISTA,
        OTORRINO
        
    }
    
    private String nombre;
    private int matricula;
    private Especialidad especialidad;
    private int cupo;
    private Historia[] lista;
    private int cantHis = 0;

    public Medico(String nombre, int matricula, Especialidad especialidad, int cupo, Historia[] lista) {
        
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.cupo = cupo;
        this.lista = lista;
        
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

    public int getCupo() {
        return cupo;
    }

    public Historia[] getLista() {
        return lista;
    }

    public int getCantHis() {
        return cantHis;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public void setLista(Historia[] lista) {
        this.lista = lista;
    }

    public void setCantHis(int cantHis) {
        this.cantHis = cantHis;
    }
    
    public boolean Disponibilidad() {
        
        return this.cantHis < cupo;
        
    }
    
    public boolean AgregarHistoria(Historia h) {
        
        if (Disponibilidad()) {
            
            lista[cantHis] = h;
            cantHis++;
            h.AsignarMedico(this);
            return true;
            
        } else {
            
            return false;
            
        }
        
    }
    
    public void EliminarHistoria(Historia h) {
        
        for (int i=0; i<cantHis; i++) {
            
            if (lista[i] == h) {
                
                for (int j=i; j<cantHis - 1; j++) {
                    
                    lista[j] = lista[j+1];
                    
                }
                
                lista[cantHis - 1] = null;
                cantHis = cantHis - 1;
                
            }
            
        }
        
    }
    
    
    
}
