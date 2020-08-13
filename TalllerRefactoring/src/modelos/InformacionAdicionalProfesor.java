package modelos;

public class InformacionAdicionalProfesor {
    private int añosdeTrabajo;
    private String facultad;
    private double BonoFijo;

    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    public void setAñosdeTrabajo(int añosdeTrabajo) {
        this.añosdeTrabajo = añosdeTrabajo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }

    public void setBonoFijo(double BonoFijo) {
        this.BonoFijo = BonoFijo;
    }  
    
    public double calcularSueldo(){
        return añosdeTrabajo*600 + BonoFijo;
    }  
}
