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
public class Creadorcolas {
   private Colas cola;

    public Creadorcolas() {
        cola = new Colas();
    }
    
    public void agregarCliente(String pNombre){
        Cliente nuevoCliente = new Cliente(pNombre);
        cola.encolar(nuevoCliente);
    }
    
    public Cliente obtenerClienteAtender() {
        if (!cola.estaVacia()){
            return (Cliente) cola.desencolar();
        }
        else{
            return null;
        }
    }
    
    public boolean hayClientes(){
        return !cola.estaVacia();
    }
    
    public void mostrarCola(){
        cola.imprimirCola();
        //
    } 
}
