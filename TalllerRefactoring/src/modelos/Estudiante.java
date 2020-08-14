package modelos;

import java.util.ArrayList;

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
    
<<<<<<< HEAD
    //Getter y setter de la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Getter y setter de la direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Getter y setter del telefono

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
      
    public double getNotaTeorico(Notas notas){
        return (notas.getNexamen()+notas.getNdeberes()+notas.getNlecciones())*0.80;
    }
    public double getNotaPractico(Notas notas){
        return (notas.getNtalleres())*0.20;
    }
=======
        //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
>>>>>>> 84b0168b706366f0a5404f96fd2baf5e768a11cc
    
    public double CalcularNota(Paralelo p, Notas notasP,Notas notasT){
        double nota=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                nota= getNotaTeorico(notasT)+getNotaPractico(notasP);
            }
        }
        return nota;
    }
    public Paralelo obtenerParalelo(Paralelo p){
         for(Paralelo par:paralelos){
             if(p.equals(par))
                 return p;
         }
        return null;
    }
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().getNotaTotal()+p.getMateria().getNotaFinal())/2;
                
            }
        }
        return notaTotal;
        
    }
}
        
    
    
    
            
        
        
