package modelos;


public class Estudiante extends Persona{
    //Informacion del estudiante
    public String matricula;

    //Getter y setter de Matricula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //Getter y setter de la edad
    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Getter y setter de la direccion
    @Override
    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    //Getter y setter del telefono
    @Override
    public Telefono getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }
    
    public Paralelo obtenerParalelo(Paralelo p){
        for(Paralelo par:paralelos){
            if(p.equals(par))
                return p;
        }
        return null;
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