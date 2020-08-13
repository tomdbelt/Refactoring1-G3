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
    public String telefono;
    public ArrayList<Paralelo> paralelos;

    @HotSpotIntrinsicCandidate
    public Persona() {
    }
    
}
