/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Tyrone
 */
public class Notas {
    double nexamen;
    double ndeberes; 
    double nlecciones; 
    double ntalleres;

    public Notas(double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        this.nexamen = nexamen;
        this.ndeberes = ndeberes;
        this.nlecciones = nlecciones;
        this.ntalleres = ntalleres;
    }

    public double getNexamen() {
        return nexamen;
    }

    public double getNdeberes() {
        return ndeberes;
    }

    public double getNlecciones() {
        return nlecciones;
    }

    public double getNtalleres() {
        return ntalleres;
    }
    
    public double getNotaTeorico(){
        return (getNexamen() + getNdeberes() + getNlecciones())*0.80;
    } 
    public double getNotaPractico(){
        return getNtalleres()*0.20;
    }
}
