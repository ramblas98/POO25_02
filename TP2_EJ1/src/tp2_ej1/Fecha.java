package tp2_ej1;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    // Constructor por defecto
    public Fecha(){
      
    };
    // Constructor con parametros
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    //Metodo setter para dia
    public void setDia(int dia) {
        this.dia = dia;
    }
    //Metodo get para dia
    public int getDia(){
        return dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    //Metodo get para mes
    public int getMes() {
        return mes;
    }
    
    //Metodo set para anio
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    //Metodo get para anio
    public int getAnio(int anio){
        return anio;
    }
    
    //Metodo reiniciar
    public void reiniciar(int d, int m, int a){
       dia = d;
       mes = m;
       anio = a;
    }
    
    public void adelantar(int d){
        if(valida()){
            dia+= d;
        }
        
    }
    
    public void imprimir(){
        System.out.println(dia + "/" + mes + "/" + anio);
    }
    
    private boolean valida(){
        //Validar que el mes este dentro del rango 1-12
        if(mes < 1 || mes > 12){
            return false; //El mes no es valido
        }
        
        //Validar que el dia este dentro de los dias del mes
        if(dia < 1 || dia > dias(mes)){
            return false; // El dia no es valido para este mes
        }
        
        //Validar que el año este dentro de un rango razonable
        if(anio < 1 || anio > 9999){
            return false; //El año no es valido
        }
        
        //Si todas las validaciones pasan
        return true;
    }
    
    private void normalizar(){
        if(!valida()){
            //Si la fecha no es valida, hay que normalizar
            if(mes < 1){ //Si el mes que menor que 1, lo corregimos
                mes = 12;
            }else if(mes > 12){ //Si mes es mayor que 12, lo corregimos
                mes = 1;
            }else if(dia > maxDias){ //Si el dia es mayor que el maximo, lo corregimos
                dia = maxDias;
            }
            
            //Validar y normalizar año si fuera necesario
            if(anio < 1){
                anio = 1; // O cualquier valor valido minimo que se decida
            }   
        }
    }
    
    private int dias(int mes){
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 ||
                mes == 10 || mes == 12){
            return 31; //Meses con 31 dias
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return 30; //Meses con 30 dias
        }else if(mes == 2){
            if(esBisiesto(anio)){
                return 29; //Si es bisiesto, febrero tiene 29 dias
            }else{
                return 28; //Si NO es bisiesto, febrero tien 28 dias.
            }
        }else{
            return 0; //Mes no valido
        }
    }
    
    public static boolean esBisiesto(int anio){
        if((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
   
}
