
package tp2_ej7;

public class CuadroMedico {
    
    private Medico[] medicos;
    private int cantMed = 0;

    public CuadroMedico() {
        
        this.medicos = new Medico[50]; 
        
    }
    

    public Medico[] getMedicos() {
        return medicos;
    }

    public int getCantMed() {
        return cantMed;
    }
    
    

    public void setMedicos(Medico[] medicos) {
        this.medicos = medicos;
    }

    public void setCantMed(int cantMed) {
        this.cantMed = cantMed;
    }
    
    
    
    public void InsertarMedico(Medico m) {
        
        this.medicos[this.cantMed] = m;
        this.cantMed = this.cantMed + 1;
        
    }
    
    public void EliminarMedico(Medico m) {
        
        for (int i=0; i<this.cantMed; i++) {
            
            if (this.medicos[i] == m) {
                
                for (int j=i; j<this.cantMed-1; j++) {
                    
                    this.medicos[j] = this.medicos[j+1];
                    
                }
                
                this.cantMed--;
                
            }
            
        }
        
    }
    
    public Medico ObtenerMedicoDis(Especialidad e) {
        
        Medico mejor = null;
    
        for (int i = 0; i < this.cantMed; i++) {
        
            Medico actual = this.medicos[i];
        
            if (actual.getEspecialidad().equals(e) && actual.Disponibilidad()) {
            
                if (mejor == null || actual.getCupo() > mejor.getCupo()) {
                
                    mejor = actual;
                
                }
            }
        }
    
        return mejor;
    
    }
    
}