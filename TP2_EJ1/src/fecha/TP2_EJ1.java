/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fecha;

/**
 *
 * @author nicor
 */
public class TP2_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Fecha f1 = new Fecha();
         f1.setDia(28);
         f1.setMes(2);
         f1.setAnio(2028);
         
        System.out.println(f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio());
        
        if(Fecha.esBiciesto(f1.getAnio())){
            System.out.println(f1.getAnio() + " es un anio biciesto");
        }else{
            System.out.println(f1.getAnio() + " no es un anio biciesto");
        }
        
        if(Fecha.esFindeAnio(f1.getDia(), f1.getMes())){
            System.out.println("Es fin de anio");
        }else{
            System.out.println("No es fin de anio");
        }
        
        if(Fecha.valida(f1)){
            System.out.println("La fecha es valida");
        }else{
            System.out.println("La fecha no es valida");
        }
        
        f1.adelantar(12);
        System.out.println(f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio());
        
       
        
                
        
        
        
        
        
        
    }
}
    
