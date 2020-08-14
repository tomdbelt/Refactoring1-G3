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
public class Direccion {
    public String callePrincipal;
    public String calleSecundaria;
    public String manzana;
    public String villa;
    
    public Direccion(String callePrincipal, String calleSecundaria, String manzana, String villa) {
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.manzana = manzana;
        this.villa = villa;
    }
    
    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getVilla() {
        return villa;
    }

    public void setVilla(String villa) {
        this.villa = villa;
    }

    
    
}
