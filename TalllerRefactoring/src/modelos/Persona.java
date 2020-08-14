/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import jdk.internal.HotSpotIntrinsicCandidate;

/**
 *
 * @author Tyrone
 */
public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    public Direccion direccion;
    public String facultad;
    public Telefono telefono;
    public ArrayList<Paralelo> paralelos;

    public Persona(String nombre, String apellido, String facultad,ArrayList<Paralelo> paralelos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.facultad = facultad;
        this.paralelos = paralelos;
    }
    //Getter y setter del Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Getter y setter del Apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //Getter y setter de la Facultad
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    //Getter y setter de la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Getter y setter de la direccion
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    //Getter y setter del telefono

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }
    @HotSpotIntrinsicCandidate
    public Persona() {
    }
    
}
