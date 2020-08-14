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
    public String direccion;
    public String facultad;
    public String telefono;
    public ArrayList<Paralelo> paralelos;

    public Persona(String nombre, String apellido, int edad, String direccion, String facultad, String telefono, ArrayList<Paralelo> paralelos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.facultad = facultad;
        this.telefono = telefono;
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
    @HotSpotIntrinsicCandidate
    public Persona() {
    }
    
}
