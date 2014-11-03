/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colas;

/**
 *
 * @author Stephanie
 */
public class Cliente {
    
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String datos = "";
        datos += nombre;
        return datos; 
    }

    public String getNombre() {
        return nombre;
    }
}
