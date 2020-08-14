package modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ayudante {
    private Estudiante est;
    private List<Paralelo> paralelos;

    Ayudante(Estudiante e){
    	est = e;
        paralelos = new ArrayList<>();
    }

    public Estudiante getEst() {
        return est;
    }

    public void setEst(Estudiante est) {
        this.est = est;
    }

    public List<Paralelo> getParalelos() {
        return Collections.unmodifiableList(paralelos);
    }

    public boolean addParalelo(Paralelo paralelo) {
        return paralelos.add(paralelo);
    }
    
    public boolean removeParalelo(Paralelo paralelo){
        return paralelos.remove(paralelo);
    }
    
    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos

    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
