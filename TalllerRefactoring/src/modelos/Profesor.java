package modelos;

import java.util.ArrayList;

public class Profesor extends Persona {
    public String codigo;
    public InformacionAdicionalProfesor info;

    private Profesor(String codigo, Persona persona) {
        this.codigo = codigo;
        this.nombre = persona.getNombre();
        this.apellido = persona.getApellido();
        this.edad = persona.getEdad();
        this.facultad = persona.getFacultad();
        this.direccion = persona.getDireccion();
        this.telefono = persona.getTelefono();
        paralelos= new ArrayList<>();
    }
    
    @Override
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
    @Override
    public void removerParalelos(Paralelo paralelo){
        paralelos.remove(paralelo);
    }   
}
