package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){
        return prof.info.getAñosdeTrabajo()*600 + prof.info.getBonoFijo();
    }  
}
