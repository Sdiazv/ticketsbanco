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
public class NodoLista {
     /**
    datos que se guardan en el nodo
    */
    Object datos;
    /**
     * nodo siguiente
     */
    NodoLista siguienteNodo;
    
    /**
     * contructor de la clase que hace referencia al objeto
     * @param datos: datos a insertar 
     */
    public NodoLista (Object datos){
        this(datos, null);
        
        
    }
    /**
     * 
     * @param datos
     * @param nodo 
     */
    NodoLista (Object datos, NodoLista nodo){
         this.datos= datos;

         siguienteNodo= nodo;
         
                 
    }
    Object obtenerObject(){
        return  this.datos;
    }
    NodoLista obtenerSiguiente(){
        return siguienteNodo;
        
    }
}
