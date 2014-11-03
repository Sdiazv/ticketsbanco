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
public class ExcepcionListaVacia extends RuntimeException {
    public ExcepcionListaVacia() {
        super("Lista"); // llama al otro contructor de ExcepcionListaVacia
    }
    public ExcepcionListaVacia(String nombre){
        super(nombre + "esta vacia"); // llama al constructor de la superclase
    }
}
