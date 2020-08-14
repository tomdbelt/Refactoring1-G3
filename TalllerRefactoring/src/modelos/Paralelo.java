package modelos;

import java.util.ArrayList;

public class Paralelo {
    public int numero;
    public Materia materia;
    public Profesor profesor;
    public ArrayList<Estudiante> estudiantes;
    public Ayudante ayudante;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    //Imprime el listado de estudiantes registrados
    public void mostrarListado(){
        //No es necesario implementar
    }
    
    //Se puede usar para calcular la nota de cualquiera de los parciales
    public double CalcularNotaParcial(Notas notas){       
        return notas.getNotaTeorico()+ notas.getNotaPractico();     
    }
      
    public double CalcularNotaTotal(){
        return (getMateria().getNotaTotal()+getMateria().getNotaFinal())/2;    
    }
}
